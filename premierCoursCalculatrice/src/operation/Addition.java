package operation;

import exception.MonException;
import exception.MonExceptionCalculatrice;
import premierCoursCalculatrice.Operation;

public class Addition extends Operation {


	public int execute(int nombreA, int nombreB) throws MonException {
		try {
			return nombreA + nombreB;
		}catch(ArithmeticException e){
			throw new MonException(2, MonExceptionCalculatrice.UTILISATION_DIFF_NOMBRE.getMessage());
		}
	}
}
