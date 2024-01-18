package bookStack;

public class Book {

	private int bno;
	private String bname;
	private float price;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book no: "+bno+"\nBook Name: "+bname+"\nPrice: "+price;
	}
	public Book() {
		bno=1;
		bname="Not Available";
		price=(float) 100.0;
	}
	public Book(int bno, String bname, float price) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.price = price;
	}
	
}
