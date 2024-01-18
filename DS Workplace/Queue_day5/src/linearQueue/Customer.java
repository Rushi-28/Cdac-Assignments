package linearQueue;

public class Customer {
	private int cno;
	private String name;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cno, String name) {
		super();
		this.cno = cno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [Reg. no=" + cno + ",Customer name=" + name + "]";
	}
	
}
