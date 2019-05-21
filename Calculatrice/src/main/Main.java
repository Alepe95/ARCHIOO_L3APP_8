package main;


import java.io.IOException;

import calculatrice.server.service.ServiceCalculatrice;
import exception.MonException;
import premierCoursCalculatrice.CalculatorConf;
import premierCoursCalculatrice.LigneCommande;



public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, MonException {
		CalculatorConf cfg = new CalculatorConf();
		cfg.init();
		new Thread(new Runnable() {
			public void run() {
				try {
					ServiceCalculatrice.launch();
				} catch (IOException | ClassNotFoundException | MonException e) {
					e.printStackTrace();
				}

			}
		}

		).start();

		// START CLIENT
		LigneCommande ligneDeCommande = new LigneCommande();
		ligneDeCommande.launch();

	}
}