
package ecalc.operations;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author rod
 */
public class OperationFactory {
	private static HashMap<String,Operation> operations;

	static {
		operations = new HashMap<String, Operation>();

		addOperationToMap(new Addition());
		addOperationToMap(new Subtract());
		addOperationToMap(new Multiplication());
		addOperationToMap(new Division());
	}

	private static void addOperationToMap(Operation op) {
		operations.put(op.getSymbol(), op);
	}

	public static Operation getOperation(String symbol) throws IllegalArgumentException {
		if (!operations.containsKey(symbol)) {
			throw new IllegalArgumentException(symbol + " is not a valid or known operation symbol");
		}
		return operations.get(symbol);
	}

	public static String getValidOperationSymbols() {
		Set<String> keys = operations.keySet();
		StringBuilder sb = new StringBuilder();
		for(String key : keys) {
			sb.append(key);
			sb.append(",");
		}
		String str = sb.toString();
		return str.substring(0, str.length()-1);
	}
	
}
