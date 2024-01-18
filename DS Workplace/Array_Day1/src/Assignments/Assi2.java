package Assignments;

public class Assi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		first10Prime();	}

	public static void first10Prime()
	{
		
			int no=1,cnt=0;
		while(cnt<10)
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
				{System.out.print(no+",");
				cnt++;
				}
				
			}
			no++;
		}
		
	}
}
