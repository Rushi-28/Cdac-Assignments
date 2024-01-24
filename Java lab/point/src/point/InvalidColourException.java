package point;

public class InvalidColourException extends Exception{

	private String msg;
	
	public InvalidColourException() {
		msg="Invalid Colour. ";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception : "+msg;
	}
	
}
