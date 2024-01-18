package linearQueue;

import java.util.Scanner;

public class LinearDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linear l=new Linear(5);
		Scanner sc=new Scanner(System.in);
		int ch,data;
		do {
			

			System.out.println("\n\t1. Enqueue");
			System.out.println("\t2. Dequeue");
			System.out.println("\t3. Display");
			System.out.println("\t0. Exit");
			System.out.println("\t Enter Your choice ");
			ch=sc.nextInt();
			switch (ch) {
			case 1: 
			System.out.println("Enter data: ");
			data=sc.nextInt();
			l.Enqueue(data);
			break;
			
			case 2:
				data=l.Dequeue();
				if(data==-9999)
				{
					System.out.println("Queue is Empty");
				}
				else System.out.println(data);
				break;
				
			case 3:
				l.display();
				break;
			}
		}while(ch!=0);
	}

}
