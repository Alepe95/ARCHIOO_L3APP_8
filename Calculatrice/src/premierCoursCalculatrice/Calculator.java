package premierCoursCalculatrice;

import exception.MonException;

public class Calculator {

	private static Operation op;
	
	public static int execute(int a, int b,char c) throws MonException {
		op = CalculatorConf.getOperator(c);
		return op.execute(a, b);
	}
	
}
