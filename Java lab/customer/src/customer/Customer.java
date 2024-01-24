package customer;

public class Customer {
	private String email,address;
	public Customer() { 	}
	
	public Customer(String email,String address) {
		this.email=email;
		this.address=address;
	}
	public void display() {
		System.out.println("Customers Email-id: "+email);
		System.out.println("Customers Address: "+address);
	}
	public float discount(float price)
	{
		float dis=0;
		return price-dis;
	}
}
