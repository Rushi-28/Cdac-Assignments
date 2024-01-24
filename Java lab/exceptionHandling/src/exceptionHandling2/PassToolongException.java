package exceptionHandling2;

public class PassToolongException extends Exception{
	
	

	String msg;

	public PassToolongException() {
		msg="Password is too long ";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exeption: "+msg;
	}

}
