
package ecalc.operations;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rod
 */
public class AdditionTest {

	Operation op;

    public AdditionTest() {
    }

    @Before
    public void setUp() {
		op = new Addition();
    }

	@Test
	public void checkSymbolIsCorrect() {
		assertEquals(TestHelper.expectedSymbolAddition, op.getSymbol());
	}

	@Test
	public void testInteger() {
		double result = op.calculate(1d,2d);
		assertEquals(3d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testFloat() {
		double result = op.calculate(4.2d, 3.1d);
		assertEquals(7.3d, result, TestHelper.epsilonFudge);
	}

	@Test
	public void testNegative() {
		double result = op.calculate(4d, -2d);
		assertEquals(2d, result, TestHelper.epsilonFudge);
	}

}