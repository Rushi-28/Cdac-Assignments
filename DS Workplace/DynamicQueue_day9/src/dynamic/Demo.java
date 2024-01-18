package dynamic;

import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new Queue();
		Scanner sc=new Scanner(System.in);
		int ch,data,pos;
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
					q1.enQueue(data);
					break;
		
					
			case 2: data=q1.deQueue();
					if(data==-9999)
						System.err.println("Queue is Empty....");
					else
						System.out.println(data);
					break;
					
		
		
						
			case 3: System.out.println(q1);
						break;
				
			
						
			}
		}while(ch!=0);
		
		
	}

}
