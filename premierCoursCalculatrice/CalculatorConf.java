package premierCoursCalculatrice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorConf {
	static Map <Character, Operation> mapOp = new HashMap<Character, Operation>();
	static Scanner sc = new Scanner(System.in);
	
	public static Operation getOperator(char op) {
		init();

		return mapOp.get(op);
	}
	
	public static void init() {
		mapOp.put('+', new Addition());
		mapOp.put('/', new Division());
	}
}
