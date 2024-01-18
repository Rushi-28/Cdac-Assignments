package IntLinkedlist;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		
		Scanner sc=new Scanner(System.in);
		int ch,data,pos;
		do {
			System.out.println("\t1.Add data in sorted order");			//
			System.out.println("\t2.Add data at beginning");			//
			System.out.println("\t3.Add data at end");	
			System.out.println("\t4.Data is present or not");			//
			System.out.println("\t5.No of Nodes in Linked List");		//
			System.out.println("\t6.Modify given data");	
			System.out.println("\t7.Modify data at given index");
			System.out.println("\t8.Delete node having data");			//
			System.out.println("\t9.Insert node at given position");	//
			System.out.println("\t10.Sort linked list");				//		
			System.out.println("\t11.Add both side");					//
			System.out.println("\t12.Reverse Linked list.");			//
			System.out.println("\t13.Split");	
			System.out.println("\t14.Merge");	
			System.out.println("\t15.find avg");	
			System.out.println("\t33.Display Linked List");				//
			System.out.println("\t0.Exit");	
			System.out.println("\tEnter Your Choise: ");
			ch=sc.nextInt();
			switch (ch) {
			case 1: System.out.println("Enter data");
					data=sc.nextInt();
					l1.addNode(data);
					break;
					
			case 2: System.out.println("Enter data");
					data=sc.nextInt();
					l1.addBeg(data);
					break;
			
			case 3: System.out.println("Enter data");
					data=sc.nextInt();
					l1.addEnd(data);
					break; 
				
			case 4: System.out.println("Enter data to search");
					data=sc.nextInt();
					l1.search(data);
					break;
					
			case 5: System.out.println("Nodes in linked list: "+l1.size());
					break;
					
			case 8: System.out.println("Enter data to be delete");
					data=sc.nextInt();
					l1.delete(data);
					break;
					
			case 9: System.out.println("Enter position to insert data");
			 		pos=sc.nextInt();
			 		System.out.println("Enter data");
					data=sc.nextInt();
			 		l1.insert(data,pos);
			 		break;
			 		
			case 10:    l1.sorted();
						break;
				
			case 11:	System.out.println("Enter data");
						data=sc.nextInt();
						l1.addBoth(data);
						break;
						
			case 12: l1.reverse();
						break;
						
			case 13: l1.split();
						break;
						
			case 14: 
						LinkedList n1= new LinkedList();n1.addEnd(10);n1.addEnd(12);n1.addEnd(14);n1.addEnd(16);
						LinkedList n2= new LinkedList();n2.addEnd(11);n2.addEnd(13);n2.addEnd(15);//n2.addEnd(17);
						
						l1.merge(n1,n2);
								break;
								
			case 15:// System.out.println("Mid is: "+l1.findMid());
				avg(l1);
						break;
						
			case 33: l1.display();
						break;
				
			
						
			}
		}while(ch!=0);
		
	}

	private static void avg(LinkedList l1) {
		// TODO Auto-generated method stub
		Node move=l1.head;
		float sum=0;
		int cnt=l1.size();
		while(move!=null)
		{
			sum+=move.data;
			move=move.next;
		}
		float avg=sum/cnt;
		System.out.println("Average= "+avg);
	}

}
