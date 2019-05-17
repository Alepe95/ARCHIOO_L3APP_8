package exception;


public enum MonExceptionCalculatrice{

	UTILISATION_SIGNE_MAUVAIS(1, "UTILISATION D'UN SIGNE AUTRE QUE + OU /"),
	UTILISATION_DIFF_NOMBRE(2,"Utilisation autre qu'un chiffre ou nombre pour l'opération"),
	UTILISATION_ZERO_DIVISION(3,"Division par Zéro interdit");
	
	private final  int code;
	private  String message ;
	
	MonExceptionCalculatrice(int code, String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode(){
		return code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public static String getNameFromCode(int code) {
		for(MonExceptionCalculatrice e : MonExceptionCalculatrice.values()){
			if(code == e.getCode()) return e.name();
		}
		return null;
	}
}
