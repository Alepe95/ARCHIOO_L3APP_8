package main;

import java.io.IOException;
import java.util.Properties;

import exception.MonException;
import premierCoursCalculatrice.CalculatorConf;
import premierCoursCalculatrice.IHM;
import premierCoursCalculatrice.LigneCommande;

public class Main {

	public static void main(String[] args) throws MonException, IOException {
		
		
		// TODO Auto-generated method stub
		IHM ihm = new LigneCommande();
		CalculatorConf.init();
		
	}

}
