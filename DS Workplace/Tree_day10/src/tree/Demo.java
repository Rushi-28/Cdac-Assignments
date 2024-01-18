package tree;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		int ch,data;
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("1. Add data in Tree");
			System.out.println("2. Display data in Tree");
			System.out.println("3. Display Inorder data in Tree");
			System.out.println("4. Display Preorder data in Tree");
			System.out.println("5. Display Postorder data in Tree");
			System.out.println("0. Exit");
			System.out.println("Enter Your Choise");
			ch=sc.nextInt();
			switch (ch) {
			case 1: System.out.println("Enter Data to insert ");
					data=sc.nextInt();
					t.addNode(data);
					break;
			
			case 2: t.display();break;
			
			case 3: t.inorder(t.root);break;
			
			case 4: t.preorder(t.root);break;
			
			case 5: t.postorder(t.root);break;
			}
		} while (ch!=0);
		
	
	}

}
