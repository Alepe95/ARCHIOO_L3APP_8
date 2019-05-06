package premierCoursCalculatrice;

import java.util.Scanner;

public class Division extends Operation {
static Scanner sc = new Scanner(System.in);
	
	
	
	public static int execute() {
		System.out.println("saisir votre premier terme");
		setOperande1(sc.nextInt());
		System.out.println("saisir votre second terme");
		setOperande2(sc.nextInt());
		
		
		setResultat(getOperande1()/getOperande2());
		
		System.out.println("votre resultat est : " + getResultat() );
		
		return getResultat();
	}
}
