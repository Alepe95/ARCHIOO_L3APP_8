package premierCoursCalculatrice;

import java.util.Scanner;

public class Operation extends Expression {
	private static int resultat;
	static Scanner sc = new Scanner(System.in);
	
	protected Operation() {
		super();
	}

	
	public static int execute() {
		return resultat;
	}
	public static void getOperateur() {
		
		System.out.println("saisir votre opérateur (+ ou /)");
		char operateur = sc.next().charAt(0);
		
		if(operateur == '+' ) {
			Addition.execute();
		}
		else	
			if(operateur == '/') {
			Division.execute();
		}
		else
			System.out.println("erreur, veuillez saisir + ou / ");
	}
		
	

	
											
}
