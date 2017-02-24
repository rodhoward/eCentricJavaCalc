
package ecalc.operations;

import java.math.BigDecimal;

/**
 *
 * @author rod
 */
public class Multiplication implements Operation {

	// "*" doesn't play nice with the main arguments.
	private static final String symbol = "x"; 

	public double calculate(double input1, double input2) {
		BigDecimal result = BigDecimal.valueOf(input1).multiply(BigDecimal.valueOf(input2));
		return result.doubleValue();
	}

	public String getSymbol() {
		return symbol;
	}

}
