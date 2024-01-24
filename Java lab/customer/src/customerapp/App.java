package customerapp;
import customer.RegCustomer;
import customer.Customer;
import java.util.Scanner;
public class App extends Customer {

	public static void main(String[] args) {
		int p;
		float f;
		String mail,addr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter type of customer \n1.Register customer \n2.New customer: ");
		p=sc.nextInt();
		if(p==1)
		{
			System.out.println("Enter customer emailid and address: ");
			mail=sc.nextLine();
			sc.nextLine();
			addr=sc.nextLine();
			Customer c1=new RegCustomer(mail,addr);
			System.out.println("Enter Shopping price: ");
			f=sc.nextFloat();
			c1.display();
			System.out.println("Discounted Shopping price: "+c1.discount(f));
		}
		else
		{
			System.out.println("Enter customer emailid and address: ");
			mail=sc.next();
			sc.nextLine();
			addr=sc.nextLine();
			Customer c2=new Customer(mail,addr);
			System.out.println("Enter Shopping price: ");
			f=sc.nextFloat();
			c2.display();
			System.out.println("Discounted Shopping price: "+c2.discount(f));
		}
	}

}
