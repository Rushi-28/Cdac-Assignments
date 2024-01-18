package stringLinkedList;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int ch;
		String str,str1;
		do {
			System.out.println("\t1.Add String at end");
			System.out.println("\t2.Add String at beginning");
			System.out.println("\t3.String is present or not");
			System.out.println("\t4.No of Nodes in Linked List");
			System.out.println("\t5.Modify given String");
			System.out.println("\t6.Modify String at given index");
			System.out.println("\t7.Display Linked List");
			System.out.println("\t0.Exit");
			System.out.println("\tEnter Your Choise: ");
			ch=sc.nextInt();
			switch (ch) {
			case	1: System.out.println("Enter String to be inserted: ");
					str=sc.next();
					l1.addEnd(str);
					break;
			
			case 2: System.out.println("Enter String to be inserted: ");
					str=sc.next();
					l1.addBeg(str);
					break;
					
			case 3: System.out.println("Enter String to be search: ");
					str=sc.next();
					if(l1.contains(str))
						System.out.println("String is present in Linked List.");
					else
						System.out.println("String is not present in Linked List.");
					break;
					
			case 4: System.out.println("No of nodes in linked list : "+l1.size());
					break;
					
			case 5: System.out.println("Enter String to be Modified: ");
					str=sc.next();
					System.out.println("Enter new String: ");
					str1=sc.next();
					l1.modify(str,str1);
					break;
					
			case 6: System.out.println("Enter index of String to be Modified: ");
					int index=sc.nextInt();
					System.out.println("Enter new String: ");
					str1=sc.next();
					l1.modify(index,str1);
					break;
					
			case 7: l1.display();
					break;
			}
		} while (ch!=0);
		sc.close();
	}

	

}
