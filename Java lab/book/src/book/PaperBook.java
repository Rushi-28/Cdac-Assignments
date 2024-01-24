package book;

public class PaperBook extends Book {
	private int dileveryCost;

	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaperBook(int bookid, String bname, double bprice) {
		super(bookid, bname, bprice);
	}

	@Override
	public String toString() {
		return super.toString()+"Dilevery cost: "+bprice+(bprice*dileveryCost/100);
	}
	public double calculatecost() {
		if(bprice<=500)
			dileveryCost=2;
		else if(bprice>500 && bprice<=1000)
			dileveryCost=5;
		else if(bprice>1000)
			dileveryCost=7;
		return bprice+(bprice*dileveryCost/100);
	}
	
}
