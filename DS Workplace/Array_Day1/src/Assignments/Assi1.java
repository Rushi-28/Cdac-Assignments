package Assignments;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrime();
	}
	public static void printPrime()
	{
		for(int no=1;no<=100;no++)
		{
			boolean flag=true;
			if(no<=1)
				System.out.println();
			else
			{
			for(int i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.print(no+",");
			}
		}
	}
}
