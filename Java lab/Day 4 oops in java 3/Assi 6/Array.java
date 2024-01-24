import java.util.Scanner;
class Array
{
	private int [][]a= new int[3][3];
	Scanner sc=new Scanner(System.in);
	
	public Array(){
		for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
			{
			System.out.println("Enter value: ");
			a[i][j]=sc.nextInt();
			}
		}
	}
	public void display()
	{for(int i=0;i<a.length;i++){	
		for(int j=0;j<a[i].length;j++)
		{
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	}
	public int max()
	{	
		int maxi=a[0][0];
		for(int i=0;i<a.length;i++){	
		for(int j=1;j<a[i].length;j++)
		
		{
			if(a[i][j]>maxi)
			maxi=a[i][j];
		}}
		return maxi;
	}
	public int min()
	{
		int mini=a[0][0];
		for(int i=0;i<a.length;i++){	
		for(int j=0;j<a[i].length;j++)
		
		{
			if(a[i][j]<mini)
			mini=a[i][j];
		}
		}
		return mini;
	}

	private int [] maxr=new int[3];
	
	private int [] maxc=new int[3];
	
	public int maxrow()
	{	for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
			{
				maxr[i]+=a[i][j];
			}
		}

		int sum=0;
		for(int i=0;i<maxr.length;i++)
		{
		System.out.println("sum of row "+(i+1)+" : "+maxr[i]);
		sum+=maxr[i];
		}
		return sum;
	}
	public int maxcolumn()
	{	for(int i=0;i<a.length;i++)
		{	
			for(int j=0;j<a[i].length;j++)
			{
				maxc[j]+=a[i][j];
			}
		}

		int sum=0;
		for(int i=0;i<maxc.length;i++)
		{
		System.out.println("sum of column "+(i+1)+" : "+maxc[i]);
		sum+=maxr[i];
		}
		return sum;
	}
}