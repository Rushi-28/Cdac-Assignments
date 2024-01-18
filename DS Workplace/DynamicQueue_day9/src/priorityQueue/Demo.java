package priorityQueue;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();
		Queue q1=new Queue(size);
		Element e1;
		int ch,data,pri;
		do {
			System.out.println("\t1.Add data in queue");			//
			System.out.println("\t2.Delete data in queue");			//
			System.out.println("\t3.Display queue");				//
			System.out.println("\t0.Exit");	
			System.out.println("\tEnter Your Choise: ");
			ch=sc.nextInt();
			switch (ch) {
			case 1: System.out.println("Enter data");
					data=sc.nextInt();
					System.out.println("Enter Priority");
					pri=sc.nextInt();
					 e1=new Element(data,pri);
					q1.enQueue(e1);
					break;
		
					
			case 2: e1=q1.deQueue();
					if(e1==null)
						System.err.println("Queue is Empty....");
					else
						System.out.println(e1);
					break;
					
		
		
						
			case 3: System.out.println(q1);
						break;
				
			
						
			}
		}while(ch!=0);
	}

}
