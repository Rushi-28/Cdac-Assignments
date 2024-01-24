package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		try
		{
			int n=sc.nextInt();
			int []arr=new int[n];
			System.out.println("Enter "+n+" elements of array: ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter index to be search in array: ");
			int key=sc.nextInt();
			System.out.println(arr[key]);
			System.out.println();
			for(int s:arr)
			{
				System.out.print(s+" ");
			}
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
		
		
		
	}
	
	

}
