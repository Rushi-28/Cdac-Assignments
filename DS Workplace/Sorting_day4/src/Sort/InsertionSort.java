package Sort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		Array.accept(a);
		Array.display(a);
		insertionSort(a);
		Array.display(a);
	}

	private static void insertionSort(int[] a) {
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				//if(a[j]>key)
					a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
	}

}
