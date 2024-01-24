package book;

public class Ebook extends Book {
	private int discount;
	public Ebook() {
		super();
	}

	public Ebook(int bookid, String bname, double bprice) {
		super(bookid, bname, bprice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public double calculatecost() {
		// TODO Auto-generated method stub
		if(bprice<=500)
			discount=2;
		else if(bprice>500 && bprice<=1000)
			discount=5;
		else if(bprice>1000)
			discount=7;
		return bprice-(bprice*discount/100);
	}
	
}
