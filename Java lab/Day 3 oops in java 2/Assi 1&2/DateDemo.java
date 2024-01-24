class DateDemo
{
	public static void main(String [] args)
	{
		Date d1;
		d1=new Date();
		Date d2=new Date(28,07,2000);
		Date d3=new Date(d2);
		d1.ShowDate();
		d2.ShowDate();
		d3.ShowDate();
	}
}