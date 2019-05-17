package premierCoursCalculatrice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import exception.MonException;
import exception.MonExceptionCalculatrice;


public class LigneCommande implements IHM {
	private static final Logger LOGGER = Logger.getLogger(Exception.class.getName());

	protected static char operateur;
	protected Scanner sc = new Scanner(System.in);
	
	public LigneCommande() throws MonException {
		launch();
	}
	
	@Override
	public void launch() {
		System.out.println("saisir votre opérateur (+) ou (/)");
		char op=sc.nextLine().charAt(0);	
		
		try {
			exceptionOperateur(op);
			System.out.println("Pas d'exception");
			System.out.println("saisir votre premier terme");
			int a = sc.nextInt();
			System.out.println("saisir votre second terme");
			int b = sc.nextInt();
			int resultat = Calculator.execute(a, b,op);
			System.out.println("resultat : " + resultat);
				

		}catch(MonException e) {
			System.out.println(MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS.getMessage());
		}catch (InputMismatchException e){
			System.out.println(MonExceptionCalculatrice.UTILISATION_DIFF_NOMBRE.getMessage());
		}
		

		
		
		
		
	}
	
	
	

	void exceptionOperateur(char op) throws MonException {
		if(op != '/' && op != '+')
			throw new MonException(MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS.getCode(),MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS.getMessage() );
	}
	
}
