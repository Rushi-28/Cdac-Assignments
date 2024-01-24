package polycustomerapp;

import polycustomer.*;
import java.util.Scanner;
public class App extends Customer {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				Customer c1=null;
				System.out.println("Enter type of customer : ");
				int n = sc.nextInt();
				System.out.println("Enter email : ");
				String email = sc.nextLine();
				sc.next();
				System.out.println("Enter address : ");
				String add = sc.next();
				if(n==1)
				{
					c1 = new Customer(email,add);
					
				}
				else if(n==2)
				{

					c1 = new RegCustomer(email, add);
				}
				System.out.println("Enter shopping price : ");
				float pr = sc.nextFloat();
				System.out.println(c1.toString());
				System.out.println("Final discounted price : "+ c1.discount(pr));
				
			}
		}