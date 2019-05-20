package operation;


import exception.MonException;
import exception.MonExceptionCalculatrice;
import premierCoursCalculatrice.Operation;

public class Division extends Operation {
	
	
	@Override
	public int execute(int nombreA, int nombreB) throws MonException {
		try {
			return nombreA / nombreB;
		}catch(ArithmeticException e){
			throw new MonException(3, MonExceptionCalculatrice.UTILISATION_ZERO_DIVISION.getMessage());
		}
	}
}
