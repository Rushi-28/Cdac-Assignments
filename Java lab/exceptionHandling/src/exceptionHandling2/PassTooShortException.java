package exceptionHandling2;

public class PassTooShortException extends Exception{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Exeption: "+msg;
		}

		String msg;

		public PassTooShortException() {
			msg="Password is too Short ";
		}
		

	}


