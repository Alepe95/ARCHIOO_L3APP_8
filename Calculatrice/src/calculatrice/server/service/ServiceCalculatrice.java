package calculatrice.server.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import exception.MonException;
import premierCoursCalculatrice.Calculator;
import premierCoursCalculatrice.Operation;

public class ServiceCalculatrice {
	private static final Logger LOGGER = Logger.getLogger(Exception.class.getName());
	private static int PORT = 10000;
	private static ServerSocket server;
	

	
	public static void launch() throws IOException, ClassNotFoundException, MonException {
		server = new ServerSocket(PORT);
		LOGGER.log(Level.INFO, "Serveur en marche");
		
		while(true) {
			Socket socket = server.accept();
			LOGGER.log(Level.INFO, "connexion established");
			
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			
			
			Wrapper operation = (Wrapper) ois.readObject();
			LOGGER.log(Level.INFO, "Message received: " + operation);
			
			
			Wrapper env = Calculator.calculOpe(operation);
			oos.writeObject(env);
			LOGGER.log(Level.INFO,"Le message a été envoyé par le serveur" + env);
					
				
		}
		

	}
}
