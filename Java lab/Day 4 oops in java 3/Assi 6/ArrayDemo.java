class ArrayDemo
{
	public static void main(String []args)
	{
		Array a1;
		a1=new Array();
		a1.display();
		System.out.println();
		System.out.println(a1.max()+" is maximum");
		System.out.println(a1.min()+" is minimum");
		System.out.println("Sum of all rows"+a1.maxrow());
		System.out.println("Sum of all columns"+a1.maxcolumn());
	}
}