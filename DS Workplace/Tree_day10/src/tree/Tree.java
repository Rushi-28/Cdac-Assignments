package tree;

import java.util.Scanner;

public class Tree {
	Node root;
	public void addNode(int data)
	{
		Node n1=new Node(data);
		if(root==null)
		{
			root=n1;
			System.out.println("Root Created Successfully.....");
		}
		else
		{
			int ch;
			Node move=root;
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				System.out.println("\nEnter 1 for inserting data at left of "+move.data);
				System.out.println("0 for at right of "+move.data);
				ch=sc.nextInt();
				if(ch==1)
				{
					if(move.next==null)
					{
						move.next=n1;
						System.out.println(n1.data+ " inserted at LEFT of "+move.data);
						break;
					}
					else
					{
						move=move.next;
					}
				}
				else if(ch==0)
				{
					if(move.pre==null)
					{
						move.pre=n1;
						System.out.println(n1.data+" inserted at RIGHT of "+move.data);
						break;
					}
					else
					{
						move=move.pre;
					}
				}
				else
				{
					System.out.println("Wrong Choise .........");
					break;
				}
			}
		}
	}
	public void display()
	{
		System.out.println("Inorder = ");
		inorder(root);
		System.out.println("\n\nPreorder = ");
		preorder(root);
		System.out.println("\n\nPostorder = ");
		postorder(root);
	}
	public void inorder(Node move)
	{
		if(move!=null)
		{
			inorder(move.next);
			System.out.print(move.data+" ");
			inorder(move.pre);
		}
		
	}
	public void preorder(Node move)
	{
		if(move!=null)
		{
			System.out.print(move.data+" ");
			preorder(move.next);
			preorder(move.pre);
		}
		
	}
	public void postorder(Node move)
	{
		if(move!=null)
		{
			postorder(move.next);
			postorder(move.pre);
			System.out.print(move.data+" ");
		}
	}
}