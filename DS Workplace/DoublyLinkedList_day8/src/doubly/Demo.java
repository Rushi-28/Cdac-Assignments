package doubly;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedlist list=new DoublyLinkedlist();
		Scanner sc=new Scanner(System.in);
		int ch,data,pos;
		do {
			System.out.println("\n\t1.Add data");
			System.out.println("\t2.Insert data at given position");
			System.out.println("\t3.Delete data");
			System.out.println("\t4.Modify data");
			System.out.println("\t5.Print Reverse linkedlist");
			System.out.println("\t6.Display LinkedList");
			System.out.println("\t0.Exit");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
					System.out.println("Enter data to insert: ");
					data=sc.nextInt();					
					list.addNode(data);
					break;
			case 2:
				System.out.println("Enter data to insert: ");
				data=sc.nextInt();
				System.out.println("Enter position");
				pos=sc.nextInt();
				list.insert(pos, data);
				break;
				
			case 3: System.out.println("Enter data to be deleted");
					data=sc.nextInt();
					list.delete(data);
					break;
			
			case 4: System.out.println("Enter Data to be modified: ");
					data=sc.nextInt();
					System.out.println("Enter new data");
					pos=sc.nextInt();
					list.modify(data,pos);
					break;
				
			case 5: System.out.println("Revese linkedlist : ");
					list.printReverse();
					break;
					
			case 6:	//System.out.println(list);
						list.display();
					break;
			}
			
		} while (ch!=0);
	}

}
