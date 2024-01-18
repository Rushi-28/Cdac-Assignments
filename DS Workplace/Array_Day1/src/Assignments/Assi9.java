package Assignments;

import java.util.Scanner;

public class Assi9 {
	public static void main(String[] args) {
		Book books[];
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter size for Book Array ");
		int no=sc.nextInt();
		books=new Book[no];

		int bid,cnt=0,price;
		String bname;
		int ch;
		do
		{
			System.out.println(" 1. Add Recod");
			System.out.println(" 2. Display All Records ");
			System.out.println(" 3. Modify");
			System.out.println(" 4. Search Record");
			System.out.println(" 0. Exit");
			System.out.println(" Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Book id: ");
				bid=sc.nextInt();
				System.out.println("Enter Book name: ");
				bname=sc.next();
				System.out.println("Enter Book price: ");
				price=sc.nextInt();
				books[cnt++]=new Book(bid,bname,price);
				break;
				
			case 2:
				for(int i=0;i<cnt;i++)
				{
				System.out.println(books[i]);
				}
				break;
			case 3:
				System.out.println("Enter index of book to be modified: ");
				int key=sc.nextInt();
				System.out.println("Enter Book name: ");
				bname=sc.next();
				System.out.println("Enter Book price: ");
				price=sc.nextInt();
				books[key-1]=new Book(key,bname,price);
				break;
			case 4:
				System.out.println("Enter book name to search: ");
				String keys=sc.next();
				search(books,keys);
				
			}
		}while(ch!=0);




	}

	private static void search(Book[] books, String keys) {
		boolean flag=true;
		for(int i=0;i<books.length;i++)
		{
			if(keys.equalsIgnoreCase(books[i].getBname()))
			{
				System.out.println(books[i]);
				flag=false;
				break;
			}
		}
		if(flag)
		System.out.println("Not found");
	}


}
class Book{
	private int bid;
	private String bname;
	private float price;
	public Book(int bid,String bname,float price)
	{
		this.bid=bid;
		this.bname=bname;
		this.price=price;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return "\nBook Id: "+bid+"\nBook Name: "+bname+"\nBook Price: "+price;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}