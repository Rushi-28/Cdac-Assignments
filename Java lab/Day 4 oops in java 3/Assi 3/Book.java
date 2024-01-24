class Book
{
	private static int cnt;
	private int bid;
	private float price;
	public Book()
	{
		cnt++;
		bid=cnt;
		price=100;
	}
	public Book(float price)
	{
		cnt++;
		bid=cnt;
		this.price=price;
	}
	public void display()
	{
		System.out.println("Book Id: "+bid);
		System.out.println("Book Price: "+price);
	}
}