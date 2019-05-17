package premierCoursCalculatrice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import operation.Addition;
import operation.Division;

public class CalculatorConf {
	static Map <Character, Operation> mapOp = new HashMap<Character, Operation>();
	
	public static Operation getOperator(char op) {
		init();
		return mapOp.get(op);
	}
	
	public static void init() {
		
		mapOp.put('+', new Addition());
		mapOp.put('/', new Division());
	}
}
