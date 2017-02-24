
package ecalc;

import ecalc.operations.Operation;
import ecalc.operations.TestHelper;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rod
 */
public class CalculateTest {

	double StubDummyReturnValue = 666d;
	Calculate calc;

	// FIXME Use Mockito or some other testing lib.
	class OperationStub implements Operation {
		public double calculate(double input1, double input2) {
			return StubDummyReturnValue;
		}
		public String getSymbol() {
			return "sysmbol";
		}
	}

	class OperationStubParam1 extends OperationStub {
		@Override
		public double calculate(double input1, double input2) {
			return input1;
		}
	}

	class OperationStubParam2 extends OperationStub {
		@Override
		public double calculate(double input1, double input2) {
			return input2;
		}
	}

    public CalculateTest() {		
	}
	
	@Test
	public void testParseValidNumber() {
		double result = Calculate.convertInputStringToDouble("3.4");
		assertEquals(3.4d, result, TestHelper.epsilonFudge);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testParseInvalidNumber() {
		Calculate.convertInputStringToDouble("badNumber");
		fail();
	}

	@Test
	public void testOperationCalcFunctionCalled() {
		calc = new Calculate(new OperationStub(), 3.4d, 3.1d);
		double result = calc.calculateResult();
		assertEquals(StubDummyReturnValue, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testInput1PassedCorrectly() {
		calc = new Calculate(new OperationStubParam1(), 3.333d, 6.666d);
		double result = calc.calculateResult();
		assertEquals(3.333d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testInput2PassedCorrectly() {
		calc = new Calculate(new OperationStubParam2(), 3.333d, 6.666d);
		double result = calc.calculateResult();
		assertEquals(6.666d, result, TestHelper.epsilonFudge);
	}

}