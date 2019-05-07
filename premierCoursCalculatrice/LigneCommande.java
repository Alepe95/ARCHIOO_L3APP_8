package premierCoursCalculatrice;

import java.util.Scanner;

public class LigneCommande implements IHM {
	
	protected static char operateur;
	protected Scanner sc = new Scanner(System.in);
	
	public LigneCommande() {
		launch();
	}
	
	@Override
	public void launch() {
		System.out.println("saisir votre opérateur (+) ou (/)");
		char op=sc.nextLine().charAt(0);
		
		
		System.out.println("saisir votre premier terme");
		int a = sc.nextInt();
		System.out.println("saisir votre second terme");
		int b = sc.nextInt();	
		
		int resultat = Calculator.execute(a, b,op);
		System.out.println("resultat : " + resultat);
	}
	
}
