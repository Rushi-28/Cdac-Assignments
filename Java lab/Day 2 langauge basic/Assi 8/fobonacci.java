class fobonacci
{
	public static void main(String []args)
	{
		int i;
		int f[];
		f=new int[10];
		f[0]=0;
		f[1]=1;
		System.out.print(f[0]+" ");
		System.out.print(f[0]+" ");
		for(i=2;i<10;i++)
		{
			f[i]=f[i-1]+f[i-2];
			System.out.print(f[i]+" ");
		}
	}
}