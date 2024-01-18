package Assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assi3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No of terms to be printed in fibonachee series: ");
			int term=Integer.parseInt( br.readLine());
		fibonachee(term);
		}
	public static void fibonachee(int term) {
		int a=0,b=1,c;
		for(int i=0;i<term;i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
