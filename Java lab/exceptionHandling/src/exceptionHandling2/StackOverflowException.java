package exceptionHandling2;

public class StackOverflowException extends Exception{

	private String msg;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception: "+msg;
	}

	public StackOverflowException() {
		msg="Stack is full. ";
	}
	
}
