
package ecalc.operations;

import java.math.BigDecimal;

/**
 *
 * @author rod
 */
public class Division implements Operation {

	private static final String symbol = "/";

	public double calculate(double input1, double input2) {
		double result;
		try {
			result = BigDecimal.valueOf(input1).divide(BigDecimal.valueOf(input2)).doubleValue();
		} catch (ArithmeticException e) {
			// No Exact Representation falling back to less acurate calculation.
			result = input1 / input2;
		}
		 
		return result;
	}

	public String getSymbol() {
		return symbol;
	}

}
