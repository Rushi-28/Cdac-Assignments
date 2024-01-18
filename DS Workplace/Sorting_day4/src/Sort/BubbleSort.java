package Sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Size For Array ");
		no=sc.nextInt();
		int arr[]=new int[no];
		Array.accept(arr);
		Array.display(arr);
		bubbleSort(arr);
		Array.display(arr);
	}
	public static void bubbleSort(int a[])
	{
		int i,j,temp,cnts=0;
		int size=a.length;
		for(i=0;i<size-1;i++)				//for loop for passes
		{
			boolean flag=true;
			for(j=0;j<size-i-1;j++)			//for loop for comparisions
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];				//for counting swapping
					a[j]=a[j+1];
					a[j+1]=temp;
					cnts++;
					flag=false;
				}
			}
			if(flag==true)
				{
				System.out.println("passes required for sorting "+i);
				break;
				}
			Array.display(a);
		}
		System.out.println("\nNo of swapping: "+cnts);
		
	}
	
}
