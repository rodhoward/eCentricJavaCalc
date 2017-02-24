
package ecalc;

import ecalc.operations.Operation;
import java.util.regex.Pattern;

/**
 *
 * @author rod
 */
public class Calculate {

	private static String numberInputRegex = "[0-9]+[.]?[0-9]*";
	private static Pattern validInputNumberPattern = Pattern.compile(numberInputRegex);

	static double convertInputStringToDouble(String input) {
		if (!validInputNumberPattern.matcher(input).matches()) {
			throw new IllegalArgumentException(input + " should be of the form" + numberInputRegex);
		}
		return Double.parseDouble(input);
	}

	private Operation op;
	private double input1;
	private double input2;

	public Calculate(Operation operation, double input1, double input2) {
		this.op = operation;
		this.input1 = input1;
		this.input2 = input2;
	}

	public double calculateResult() {
		return op.calculate(this.input1, this.input2);
	}

}
