package main;

import exception.MonException;
import premierCoursCalculatrice.CalculatorConf;
import premierCoursCalculatrice.IHM;
import premierCoursCalculatrice.LigneCommande;

public class Main {

	public static void main(String[] args) throws MonException {
		// TODO Auto-generated method stub
		IHM ihm = new LigneCommande();
		CalculatorConf.init();
	}

}
