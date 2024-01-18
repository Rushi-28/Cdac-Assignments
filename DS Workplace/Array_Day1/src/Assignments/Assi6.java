package Assignments;

public class Assi6 {
	public static int power(int base,int index)
	{
		int pow=1;
		for(int i=0;i<index;i++)
		{
			pow*=base;
		}
		return pow;
	}
	public void todecimal(int binary)
	{
		int mod=0,sum=0,index=0;
		while(binary>0)
		{
			mod=binary%10;
			binary/=10;
			sum+=mod*power(2,index);
		}index++;
	}
}
