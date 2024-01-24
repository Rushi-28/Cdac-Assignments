import java.util.Scanner;
class Arraydemo
{
	public static void main(String [] args)
	{
		int i,res;
		int [] arr={11,21,31,41};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to search");
		i=sc.nextInt();
		res=Search(arr,i);
		if(res==arr.length)
		System.out.println("not found");
		else System.out.println("fount at "+(i+1)+" index");
	}
		public static int Search(int [] a,int key)
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			return i;
		}
		return i;
	}
}