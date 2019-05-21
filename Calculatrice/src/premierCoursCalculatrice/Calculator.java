package premierCoursCalculatrice;

import calculatrice.server.service.Wrapper;
import exception.MonException;

public class Calculator {

	
	public static int execute(int a, int b,char operateur ) throws MonException {
		Operation op = CalculatorConf.getOperator(operateur);
		int res = op.execute(a, b);
		return res;
	}
	
	
	public static Wrapper calculOpe(Wrapper wrap) throws MonException {
		Operation op = CalculatorConf.getOperator(wrap.getOperande());
		int res = op.execute(wrap.getA(), wrap.getB());
		wrap.setResultat(res);
		return wrap;
	}
	
	
	
	
}
