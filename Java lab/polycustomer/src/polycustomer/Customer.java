package polycustomer;

public class Customer {
	private String email,address;
	public Customer() { 	}
	
	public Customer(String email,String address) {
		this.email=email;
		this.address=address;
	}
	public String toString() {
		return "Customers Email-id: "+email+"Customers Address: "+address;
		
	}
	public float discount(float price)
	{
		float dis=0;
		return price-dis;
	}
}