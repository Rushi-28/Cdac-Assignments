package Assignments;

public class Assi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrong();
	}

	public static void armstrong() {
		
		for(int num=1;num<1000;num++)
		{
			int cnt1=countdigit(num);
			int mod,temp=num,sum=0;
			while(temp!=0)
			{
				//temp=num;
				mod=temp%10;
				temp=temp/10;
				sum=sum+power(mod,cnt1);
			}
			if(num==sum)
				System.out.println(num+" ");
			
		}
	}
	public static int countdigit(int num)
	{	int cnt=0;
		while(num!=0)
		{
			num=num/10;
			cnt++;
		}
		return cnt;
	}
	public static int power(int base,int index)
	{
		int res=1;
		for(int i=1;i<=index;i++)
		{
			res=res*base;
		}
		return res;
	}
}
