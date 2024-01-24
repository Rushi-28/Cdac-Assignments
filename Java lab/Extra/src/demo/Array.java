package demo;

public class Array {

	public static void main(String[] args)
	{
	
		int [] arr= {15,35,65,12,48};
		for(int c: arr)
		{
			System.out.print(c+" ");
			
		}
		System.out.println();
		sort(arr);
		
		
	}
	public static void sort(int []a)
	{
		int temp;
		for(int j=0;j<a.length;j++)
		{for(int i=j+1;i<a.length;i++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
				
		}
		}
		for(int c: a)
		{
			
			System.out.print(c+" ");
		}
	}
}
