package circularQueue;

import java.util.Scanner;

public class CircularDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size for circular Queue: ");
		int size=sc.nextInt();
		CircularQueue cs=new CircularQueue(size);
		int data,ch;
		do {
			

				System.out.println("\n\t1. Enqueue");
				System.out.println("\t2. Dequeue");
				System.out.println("\t3. Display");
				System.out.println("\t0. Exit");
				System.out.println("\t Enter Your choice ");
				ch=sc.nextInt();
				switch (ch) {
				case 1:System.out.println("Enter data: ");
				data=sc.nextInt();
				cs.enQueue(data);
				break;
				
				case 2:
					data=cs.deQueue();
					if(data==-9999)
					{
						System.out.println("Queue is Empty");
					}
					else System.out.println(data);
					break;
					
				case 3:
					cs.display();
					break;
				
				}
		}while(ch!=0);
	}

}
