package exceptionHandling2;

public class StackUnderflowException extends Exception {

	private String msg;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception: "+msg;
	}

	public StackUnderflowException() {
		msg="Stack is Empty. ";
	}
}
