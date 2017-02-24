
package ecalc.operations;

/**
 *
 * @author rod
 */
public interface Operation {
	String getSymbol();
	public double calculate(double input1, double input2);
}
