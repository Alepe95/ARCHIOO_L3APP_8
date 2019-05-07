package premierCoursCalculatrice;

public class Calculator {

	private static Operation op;
	
	public static int execute(int a, int b,char c) {
		op = CalculatorConf.getOperator(c);
		return op.execute(a, b);
	}
	
}
