class Prime
{
	public void isPrime()
	{
		int i,num,cnt=0;
											//boolean flag=false;
		for(num=10;num<100;num++)
		{
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
											//flag=true;
					break;
				}
			
			}
			
			if(i==num)
			{
				System.out.print(num+",");
				cnt++;
			}								//flag=false;
			
		}
		System.out.println();
		System.out.println(cnt);
	}
}