package Assignments;

public class Assi8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= new int[] {1,2,3,4,5};
		int []arr2= new int[] {11,12,13,14};
		merge(arr,arr2);
	}

	private static void merge(int[] arr, int[] arr2) {
		// TODO Auto-generated method stub
		int len=arr.length+arr2.length;
		int []ar=new int[len];
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				ar[j]=arr[j];
			}
			for(int n=0;n<arr2.length;n++)
			{
				ar[arr.length+n]=arr2[n];
			}
		}
		for(int s: ar)
			System.out.print(s+" ");
	}

}
