package linearQueue;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		System.out.println("Enter size for customer queue: ");
				Scanner sc=new Scanner(System.in);
				int size=sc.nextInt();
				CustQueue cq=new CustQueue(size);				
				int ch,eno;
				Customer data;
				String ename;
				do {
					

					System.out.println("\n\t1. Enqueue");
					System.out.println("\t2. Dequeue");
					System.out.println("\t3. Display");
					System.out.println("\t0. Exit");
					System.out.println("\t Enter Your choice ");
					ch=sc.nextInt();
					switch (ch) {
					case 1: 
					System.out.println("Enter Employee no and name: ");
					eno=sc.nextInt();
					ename=sc.next();
					Customer c1=new Customer(eno, ename);
					cq.Enqueue(c1);
					break;
					
					case 2:
						data=cq.Dequeue();
						if(data==null)
						{
							System.out.println("Queue is Empty");
						}
						else System.out.println(data);
						break;
						
					case 3:
						cq.display();
						break;
					}
				}while(ch!=0);
			}

	}


