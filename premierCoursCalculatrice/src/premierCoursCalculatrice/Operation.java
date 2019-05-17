package premierCoursCalculatrice;

import exception.MonException;

public class Operation {
	private static int resultat;	
	int nombreA;
	int nombreB;
	
	public int execute(int nombreA, int nombreB) throws MonException {
		this.nombreA = nombreA;
		this.nombreB = nombreB;
		return resultat;
		
	}


										
}
