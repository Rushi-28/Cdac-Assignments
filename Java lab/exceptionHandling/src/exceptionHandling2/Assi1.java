package exceptionHandling2;

import java.util.Scanner;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password: ");
		String pass=sc.next();
		try
		{
			if(pass.length()>12)
				throw new PassToolongException();
		}
		catch(PassToolongException e)
		{
			System.out.println(e);
		}
		try
		{
			if(pass.length()<6)
				throw new PassTooShortException();
		}
		catch(PassTooShortException e)
		{
			System.out.println(e);
		}
	}

}
