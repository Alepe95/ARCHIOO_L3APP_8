package premierCoursCalculatrice;


public abstract class Expression {
	private static int operande1;	
	private static int operande2;
	private static int resultat;
	
	protected Expression() {
		throw new IllegalStateException("Utility class");
	}

	public static int getOperande2() {
		return operande2;
	}
	public static void setOperande2(int operande2) {
		Expression.operande2 = operande2;
	}
	public static int getOperande1() {
		return operande1;
	}
	public static void setOperande1(int operande1) {
		Expression.operande1 = operande1;
	}
	
	public static int getResultat() {
		return resultat;
	}
	public static void setResultat(int resultat) {
		Expression.resultat = resultat;
	}

	
	
}
