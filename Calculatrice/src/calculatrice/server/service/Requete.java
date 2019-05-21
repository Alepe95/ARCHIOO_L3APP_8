package calculatrice.server.service;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Requete {
	
	private static final Logger LOGGER = Logger.getLogger(Requete.class.getName());

	private static int PORT = 10000;

	public static Wrapper envoie(Wrapper num) throws IOException, ClassNotFoundException {
		InetAddress host = InetAddress.getLocalHost();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;

		Socket socket = new Socket(host.getHostName(), PORT);

		oos = new ObjectOutputStream(socket.getOutputStream());
		LOGGER.log(Level.INFO, "Connection serveur établie !");

		LOGGER.log(Level.INFO, "Envoie de la requete vers le Serveur");
		oos.writeObject(num);

		ois = new ObjectInputStream(socket.getInputStream());
		Wrapper resultatMessage = (Wrapper) ois.readObject();
		LOGGER.log(Level.INFO, "Message reçu : " + resultatMessage);
		
		socket.close();
		
		return resultatMessage;

	}

}