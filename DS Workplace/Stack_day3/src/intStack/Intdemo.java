package intStack;

public class Intdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cstack c=new Cstack(10);
		int cnt=0,no=2;
		while(cnt<10)
		{
			if(isprime(no))
			{
				c.push(no);
				cnt++;
			}
			no++;
		}
		c.display();
	}

	private static boolean isprime(int no) {
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;
				break;
			}
			
		}
		return flag;
	}

}
