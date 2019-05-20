package premierCoursCalculatrice;

import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import exception.MonException;
import exception.MonExceptionCalculatrice;
import internationalisation.ApplicationProperties;


public class LigneCommande implements IHM {
	private static final Logger LOGGER = Logger.getLogger(Exception.class.getName());
	ApplicationProperties prop;


	protected static char operateur;
	protected Scanner sc = new Scanner(System.in);
	InputStream input = null;
	
	public LigneCommande() throws MonException, IOException {
		launch();
	}
	
	@Override
	public void launch() throws IOException {
		
		System.out.println("Choose your language 'fr' for french, 'en' for english");
		String language=sc.nextLine();
		if(language.equals("FR") || language.equals("fr")|| language.equals("français"))
			prop =  ApplicationProperties.getInstance("/Users/alexis/Desktop/Java/Calculatrice/src/internationalisation/TextFr.properties");
		else
			prop =  ApplicationProperties.getInstance("/Users/alexis/Desktop/Java/Calculatrice/src/internationalisation/TextEn.properties");

		System.out.println(prop.getProperty("Text3"));
		char op=sc.nextLine().charAt(0);	
		try {
			exceptionOperateur(op);
			System.out.println(prop.getProperty("Text1"));
			int a = sc.nextInt();
			System.out.println(prop.getProperty("Text2"));
			int b = sc.nextInt();
			int resultat = Calculator.execute(a, b,op);
			System.out.println(prop.getProperty("Text4") + resultat);
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
