package doubleEndedQueue;

import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleEnded q1=new DoubleEnded();
		Scanner sc=new Scanner(System.in);
		int ch,data,pos;
		do {
			System.out.println("\t1.Add data from front in queue");
			System.out.println("\t2.Add data from front in queue");
			System.out.println("\t3.Delete data from front in queue");			
			System.out.println("\t4.Delete data from rear in queue");//
			System.out.println("\t5.Display queue");				//
			System.out.println("\t0.Exit");	
			System.out.println("\tEnter Your Choise: ");
			ch=sc.nextInt();
			switch (ch) {
			case 1: System.out.println("Enter data");
					data=sc.nextInt();
					q1.enQueueFront(data);
					break;
		
			case 2: System.out.println("Enter data");
					data=sc.nextInt();
					q1.enQueueRear(data);
					break;
					
			case 3: data=q1.deQueueFront();
					if(data==-9999)
						System.err.println("Queue is Empty....");
					else
						System.out.println(data);
					break;
					
			case 4: data=q1.deQueueRear();
					if(data==-9999)
						System.err.println("Queue is Empty....");
					else
						System.out.println(data);
					break;
		
						
			case 5: System.out.println(q1);
						break;
				
			
						
			}
		}while(ch!=0);
	}

}
