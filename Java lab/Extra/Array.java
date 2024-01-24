class Array
{
	public static int Search(int [] a,int key)
	{
		int i=-1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			return i;
		}
		return i;
	}
}