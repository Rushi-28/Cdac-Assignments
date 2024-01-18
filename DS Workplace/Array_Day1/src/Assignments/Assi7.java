package Assignments;

import java.util.Scanner;

public class Assi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no: ");
		int num=sc.nextInt();
		palindrome(num);
		sc.close();
	}

	private static void palindrome(int num) {
		// TODO Auto-generated method stub
		int temp=num;
		int mod,res=0;
		while(temp!=0)
		{
			mod=temp%10;
			temp=temp/10;
			res=res*10+mod;
		}
		if(res==num)
			System.out.println("Is a palindrome");
		else

			System.out.println("it is not a palindrome");
	}
	
}
