package polycustomer;

public class RegCustomer extends Customer {
	private static int cnt;
	private int regno;
	static
	{
		cnt=1000;
	}
	public RegCustomer() {
		super();
	}

	public RegCustomer(String email, String address) {
		super(email, address);
		cnt++;
		this.regno=cnt;
	}
	public float discount(float price)
	{
		float dis=price*0.05f;
		return price-dis;
	}

	@Override
	public String toString() {
		return "Registration no: "+regno+super.toString();
	}
}
