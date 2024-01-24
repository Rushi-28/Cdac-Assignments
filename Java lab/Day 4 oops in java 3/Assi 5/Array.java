import java.util.Scanner;
class Array
{
	private int [] a= new int[5];
	Scanner sc=new Scanner(System.in);
	
	public Array(){
	for(int i=0;i<a.length;i++)
		{
		System.out.println("Enter value: ");
		a[i]=sc.nextInt();
		}
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");
		}
	}
	public int max()
	{
		int maxi=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>maxi)
			maxi=a[i];
		}
		return maxi;
	}
	public int min()
	{
		int mini=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<mini)
			mini=a[i];
		}
		return mini;
	}

	public float avg()
	{
		int aver=0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		aver=sum/a.length;
		return aver;
	}


}