package calculatrice.server.service;

import java.io.Serializable;

public class Wrapper implements Serializable {
	private int a;
	private int b;
	private Character operande;
	private int resultat;
	
	public Wrapper(int a, int b, Character operande) {
		this.setA(a);
		this.setB(b);
		this.setOperande(operande);
		this.resultat = 0;
	}

	public Character getOperande() {
		return operande;
	}

	public void setOperande(Character operande) {
		this.operande = operande;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getResultat() {
		
		// TODO Auto-generated method stub
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Enveloppe [a = " + a+ " b = " + b + "resultat = " + resultat + "Operateur = " + operande;
	}
	
	
}
