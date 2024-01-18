package Sort;

import java.util.Scanner;

public class Array {
	public static void accept(int a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter "+a.length+" Elements ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
	}
	public static void display(int a[])
	{
		System.out.println("\n--------- Array is ---------\n");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}
	
}
