
package ecalc.operations;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rod
 */
public class SubtractTest {

	Operation op;

    public SubtractTest() {
    }

    @Before
    public void setUp() {
		op = new Subtract();
    }

	@Test
	public void checkSymbolIsCorrect() {
		assertEquals(TestHelper.expectedSymbolSubtract, op.getSymbol());
	}

	@Test
	public void testInteger() {
		double result = op.calculate(5d, 2d);
		assertEquals(3d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testFloat() {
		double result = op.calculate(4.2d, 3.1d);
		assertEquals(1.1d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testNegative() {
		double result = op.calculate(-4d, 2d);
		assertEquals(-6d, result, TestHelper.epsilonFudge);
	}

}