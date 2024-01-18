package assignments;

import java.util.Scanner;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1=new int[]{1,2,3};
		int []arr2=new int[]{11,2,3,15,18};
		display(arr1);
		display(arr2);
		intersection(arr1,arr2);
		union(arr1,arr2);
		}
	private static int common(int[] arr1, int[] arr2) {
		int cnt=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					cnt++;
					break;
				}
			}
		}
		return cnt;
	}
	private static void intersection(int[] arr1, int[] arr2) {
		int k=0;
		int cnt=common(arr1,arr2);
		int []ar=new int[cnt];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					ar[k++]=arr1[i];
				}
			}
		}
		display(ar);
	}
	private static void union(int[] arr1, int[] arr2) {
		int k=0;
		int cnt=common(arr1,arr2);
		int len=((arr1.length+arr2.length)-cnt);
		int []arun=new int[len];
		for(int i=0;i<arr1.length;i++)
		{
			arun[k++]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<arr1.length;j++)
			{
			//	arun[k++]=arr1[i];
				if(arr2[i]==arr1[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
				arun[k++]=arr2[i];
		}
		display(arun);
	}
	
	public static void display(int[] arr1)
	{
		System.out.println();
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	}
	
}
