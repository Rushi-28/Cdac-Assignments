class BoxDemo
{
	public static void main(String [] args)
	{
		Box b1;
		b1=new Box();
		Box b2=new Box(2.5f,4.5f,5);
		Box b3=new Box(b2);
		b1.Volume();
		b2.Volume();
		b3.Volume();
	}
}