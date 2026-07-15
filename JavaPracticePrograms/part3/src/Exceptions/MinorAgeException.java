package Exceptions;

public class MinorAgeException extends RuntimeException{
	String msg;

	public MinorAgeException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	
}
