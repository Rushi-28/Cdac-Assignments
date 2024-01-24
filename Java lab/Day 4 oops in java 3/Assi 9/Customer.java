class Address
{
	private String area,city,pincode;
	public Address()
	{
		area=new String("Not Set");
		city=new String("Not Set");
		pincode=new String("Not Set");
	}
	public Address(String area,String city,String pincode)
	{	
		this.area=new String(area);
		this.city=new String(city);
		this.pincode=new String(pincode);
	}
	public void display()
	{
		System.out.println("Area : "+area);
		System.out.println("City : "+city);
		System.out.println("Pincode : "+pincode);
	}
}

class Customer
{
	private String email;
	Address local;
	public Customer()
	{
		email=new String("Not Available");
		local=new Address();
	}
	public Customer(String email,String area,String city,String pincode)
	{
		this.email=new String(email);
		local=new Address(area,city,pincode);
	}
	public void display()
	{
		System.out.println("Email Id : "+email);
		local.display();
	}

}