
package ecalc.operations;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rod
 */
public class MultiplicationTest {

	Operation op;

    public MultiplicationTest() {
    }

    @Before
    public void setUp() {
		op = new Multiplication();
    }

	@Test
	public void checkSymbolIsCorrect() {
		assertEquals(TestHelper.expectedSymbolMultiplication, op.getSymbol());
	}

	@Test
	public void testInteger() {
		double result = op.calculate(1d, 2d);
		assertEquals(2d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testFloat() {
		double result = op.calculate(4.2d, 3.1d);
		assertEquals(13.02d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testNegative() {
		double result = op.calculate(-4d, 2d);
		assertEquals(-8d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testOverrun() {
		double result = op.calculate(1.3d,Math.PI);
		assertEquals(4.08407045d, result, TestHelper.epsilonFudge);
	}

}