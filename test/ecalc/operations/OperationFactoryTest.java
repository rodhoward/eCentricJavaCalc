package ecalc.operations;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rod
 */
public class OperationFactoryTest {

	public OperationFactoryTest() {
	}

	@Test
	public void testGetAddition() {
		Operation op = OperationFactory.getOperation(TestHelper.expectedSymbolAddition);
		assertEquals(op.getSymbol(), TestHelper.expectedSymbolAddition);
	}

	@Test
	public void testGetSubtract() {
		Operation op = OperationFactory.getOperation(TestHelper.expectedSymbolSubtract);
		assertEquals(op.getSymbol(), TestHelper.expectedSymbolSubtract);
	}

	@Test
	public void testGetMultiplication() {
		Operation op = OperationFactory.getOperation(TestHelper.expectedSymbolMultiplication);
		assertEquals(op.getSymbol(), TestHelper.expectedSymbolMultiplication);
	}

	@Test
	public void testGetDivision() {
		Operation op = OperationFactory.getOperation(TestHelper.expectedSymbolDivision);
		assertEquals(op.getSymbol(), TestHelper.expectedSymbolDivision);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testGetBadSymbol() {
		OperationFactory.getOperation("BAD SYMBOL");
		fail();
	}
}
