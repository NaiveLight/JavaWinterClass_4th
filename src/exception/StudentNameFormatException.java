package exception;

public class StudentNameFormatException extends IllegalArgumentException{
	
	String message;
	
	public StudentNameFormatException(String message){
		super(message);
		this.message = message;
	}
	
	public String getMessage(){
		return "My Exception: " + message ;
	}

}
