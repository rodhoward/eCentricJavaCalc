
package ecalc.operations;

import java.math.BigDecimal;

/**
 *
 * @author rod
 */
public class Subtract implements Operation {

	private static final String symbol = "-";

	public double calculate(double input1, double input2) {
		BigDecimal result = BigDecimal.valueOf(input1).subtract(BigDecimal.valueOf(input2));
		return result.doubleValue();
	}

	public String getSymbol() {
		return symbol;
	}

}
