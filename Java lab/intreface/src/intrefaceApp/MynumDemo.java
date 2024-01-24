package intrefaceApp;

import java.util.Scanner;

import intrefaceAss2.*;

public class MynumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		MyNum io=new MyNum();
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		x=sc.nextInt();
		System.out.println("Factorial: "+io.factorial(x));
		if(io.isEven(x))
		System.out.println("Number is Even");
		if(io.isOdd(x))
			System.out.println("Number is Odd");
		if(io.isPrime(x))
				System.out.println("Number is not Prime");
		else System.out.println("Number is Prime");
	}

}
