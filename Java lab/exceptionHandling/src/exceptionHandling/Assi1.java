package exceptionHandling;

import java.util.InputMismatchException;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			System.out.println(num1/num2);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a.getMessage());
		}
		catch(InputMismatchException b)
		{
			System.out.println(b.getMessage());
		}
		catch(NumberFormatException d)
		{
			System.out.println(d.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
