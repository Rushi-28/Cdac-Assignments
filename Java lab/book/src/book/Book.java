package book;

public abstract class Book {
	private int bookid;
	private String bname;
	protected double bprice;
	public Book(int bookid, String bname, double bprice) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.bprice = bprice;
	}
	public Book() {
		bname="Not Given";
	}
	@Override
	public String toString() {
		return "\nBook Name: "+bname+"\nBook id: "+bookid+"\nBook Price: "+bprice;
	}
	
	public abstract double calculatecost();
	
}
