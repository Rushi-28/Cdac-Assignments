package Sort;

import java.util.Scanner;

public class EArray {

	public static void accept(Emp[] arr) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter employee no ,name and salary");
			int eno=sc.nextInt();
			String name=sc.next();
			float sal=sc.nextFloat();
			arr[i]=new Emp(eno,name,sal);
			
		}
	}

	public static void display(Emp[] arr) {
		// TODO Auto-generated method stub
		System.out.println("\n--------- Employee is ---------\n");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
	}
	
}
