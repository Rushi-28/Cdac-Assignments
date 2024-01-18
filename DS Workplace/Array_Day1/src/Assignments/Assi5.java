package Assignments;

import java.util.Scanner;

public class Assi5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no: ");
				int num=sc.nextInt();
				
				perfectnum(num);
				sc.close();
			}
			public static void perfectnum(int num)
			{
				int sum=0;
				for(int i=1;i<num;i++)
				{
					if(num%i==0)
					{
						sum=sum+i;
					}
				}
				if(sum==num)
					System.out.println(num+" Its perfect Number");
				else 
					System.out.println(num+" Its  not a perfect Number");
			}
	

	

}
