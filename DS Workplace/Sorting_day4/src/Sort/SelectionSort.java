package Sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Size For Array ");
		no=sc.nextInt();
		Emp arr[]=new Emp[no];
		EArray.accept(arr);
		EArray.display(arr);
		SelectionSort(arr);
		EArray.display(arr);
	}

	private static void SelectionSort(Emp[] arr) {
		// TODO Auto-generated method stub
		int i,j;
		int size=arr.length;
		for(i=0;i<size-1;i++)
		{
			Emp small=arr[i];
			int index=i;
			for(j=i+1;j<size;j++)
			{
				if(arr[j].getSal()<small.getSal())
				{
					small=arr[j];
					arr[j]=arr[i];
					arr[i]=small;
				}
			}
		}
	}

}
