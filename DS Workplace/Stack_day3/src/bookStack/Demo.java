package bookStack;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cstack cs=new Cstack(5);
		int ch;
		Book data;
		int bno;
		String bname;
		float price;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\t1. Push");
			System.out.println("\t2. Pop");
			System.out.println("\t3. Peek");
			System.out.println("\t4. Display");
			System.out.println("\t0. Exit");
			System.out.println("\t1. Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println(" Enter Book no, Book name, and its price: ");
				bno=sc.nextInt();
				bname=sc.next();
				price=sc.nextFloat();
				data=new Book(bno,bname,price);
				cs.push(data);
				break;
			case 2:
				data=cs.pop();
				if(data==null)
					System.out.println("Stack Is empty ");
				else
					System.out.println("Deleted Ele Is "+data);
				break;
			case 3:
				data=cs.peek();
				System.out.println(data);
				break;
			case 4:
				cs.display();
					break;
				
			}
		}
		while(ch!=0);
	}

}
