class Prime
{
	public static void main(String []args)
	{
		int no=7;
		boolean flag=false;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				System.out.println("Its not Prime");	
				flag=true;
			}
		}
		if(flag==false)
		System.out.println("Its Prime Number");
	}
}