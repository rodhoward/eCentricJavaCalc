
package ecalc.operations;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rod
 */
public class DivisionTest {

	Operation op;

    public DivisionTest() {
    }

    @Before
    public void setUp() {
		op = new Division();
    }

	@Test
	public void checkSymbolIsCorrect() {
		assertEquals(TestHelper.expectedSymbolDivision, op.getSymbol());
	}

	@Test
	public void testInteger() {
		double result = op.calculate(1d, 2d);
		assertEquals(0.5d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testFloat() {
		double result = op.calculate(4.2d,3.1d);
		assertEquals(1.35483871d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testNegative() {
		double result = op.calculate(-4d, 2d);
		assertEquals(-2d, result, TestHelper.epsilonFudge);
	}

}