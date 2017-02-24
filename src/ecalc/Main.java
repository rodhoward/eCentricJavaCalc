package ecalc;

import ecalc.operations.Operation;
import ecalc.operations.OperationFactory;

/**
 *
 * @author rod
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		if (args.length != 3) {
			System.err.println("Expecting a number followed by the operator followed by a second number. e.g.\n4 + 5");
			System.err.println("Valid Symbols are: " + OperationFactory.getValidOperationSymbols());
			return;
		}

		try {
			System.out.println(doCalculation(args));

		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

	}

	private static double doCalculation(String[] args) {
		Calculate calc = getCalculator(args);
		return calc.calculateResult();
	}

	private static Calculate getCalculator(String[] args) {
		Operation op = OperationFactory.getOperation(args[1]);
		double input1 = Calculate.convertInputStringToDouble(args[0]);
		double input2 = Calculate.convertInputStringToDouble(args[2]);
		return new Calculate(op, input1, input2);
	}
}
