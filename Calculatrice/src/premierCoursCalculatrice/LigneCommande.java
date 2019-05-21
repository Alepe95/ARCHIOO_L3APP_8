package premierCoursCalculatrice;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import calculatrice.server.service.Requete;
import calculatrice.server.service.Wrapper;
import exception.MonException;
import exception.MonExceptionCalculatrice;
import internationalisation.ApplicationProperties;


public class LigneCommande implements IHM {
	private static final Logger LOGGER = Logger.getLogger(Exception.class.getName());
	ApplicationProperties prop;
	
	protected Scanner sc = new Scanner(System.in);
	InputStream input = null;
	
	public LigneCommande() throws MonException, IOException, ClassNotFoundException {
		launch();
	}
	
	@Override
	public void launch() throws IOException, ClassNotFoundException {
		
		Wrapper wrap;
		System.out.println("Choose your language 'fr' for french, 'en' for english");
		String language=sc.nextLine();
		if(language.equals("FR") || language.equals("fr")|| language.equals("français"))
			prop =  ApplicationProperties.getInstance("/Users/alexis/Desktop/Java/Calculatrice/src/internationalisation/TextFr.properties");
		else
			prop =  ApplicationProperties.getInstance("/Users/alexis/Desktop/Java/Calculatrice/src/internationalisation/TextEn.properties");
		System.out.println(prop.getProperty("Text3"));
		Character op=sc.nextLine().charAt(0);
		
		while(true){
			
			try {
				
				exceptionOperateur(op);
				System.out.println(prop.getProperty("Text1"));
				int a = sc.nextInt();
				System.out.println(prop.getProperty("Text2"));
				int b = sc.nextInt();
				wrap = Requete.envoie(new Wrapper(a,b, op));
				
				System.out.println(prop.getProperty("Text4") + wrap.getResultat());
			}catch(MonException e) {
				System.out.println(MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS.getMessage());
			}catch (InputMismatchException e){
				System.out.println(MonExceptionCalculatrice.UTILISATION_DIFF_NOMBRE.getMessage());
			}
		}
	}
		

	void exceptionOperateur(Character op) throws MonException {
		if(op != '/' && op != '+')
			throw new MonException(MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS.getCode(),MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS.getMessage() );
	}
	
}
