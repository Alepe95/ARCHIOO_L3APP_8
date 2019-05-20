package test;

import static org.junit.Assert.*;

import exception.MonException;
import exception.MonExceptionCalculatrice;
import operation.Addition;
import premierCoursCalculatrice.Calculator;
import premierCoursCalculatrice.CalculatorConf;
import premierCoursCalculatrice.IHM;
import premierCoursCalculatrice.LigneCommande;

public class TestDivision {

	@org.junit.Test
	
	public void divisionZero() throws MonException {
		int a = 20;
		int b = 10;
		char c = '/';
		//  thrown.expect(IllegalArgumentException.class);

		assertEquals( MonExceptionCalculatrice.UTILISATION_SIGNE_MAUVAIS, Calculator.execute(a, b, c));
		
	}

}
