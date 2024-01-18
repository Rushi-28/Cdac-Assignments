package binarySearchTree;

import java.util.Scanner;

public class BSTree {
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
			//int ch;
			Node move=root;
		//	Scanner sc=new Scanner(System.in);
			while(true)
			{
				if(move.data<n1.data)
				{
					if(move.next==null)
					{
						move.next=n1;
						System.out.println(n1.data+ " inserted at right of "+move.data);
						break;
					}
					else
					{
						move=move.next;
					}
				}
				else if(move.data>n1.data)
				{
					if(move.pre==null)
					{
						move.pre=n1;
						System.out.println(n1.data+" inserted at left of "+move.data);
						break;
					}
					else
					{
						move=move.pre;
					}
				}
				else
				{
					System.out.println("Duplicate Elements can not be inserted....");
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
			inorder(move.pre);
			System.out.print(move.data+" ");
			inorder(move.next);
		}
		
	}
	public void preorder(Node move)
	{
		if(move!=null)
		{
			System.out.print(move.data+" ");
			preorder(move.pre);
			preorder(move.next);
		}
		
	}
	public void postorder(Node move)
	{
		if(move!=null)
		{
			postorder(move.pre);
			postorder(move.next);
			System.out.print(move.data+" ");
		}
	}
	public int findLargest() {
		Node move=root;
		while(move.next!=null)
			move=move.next;
		return move.data;
	}
	public int findLowest() {
		Node move=root;
		while(move.pre!=null)
			move=move.pre;
		return move.data;
	}
	public int findHeight(Node move) {
		if(move==null)
			return -1;
		int left= findHeight(move.pre);
		int right= findHeight(move.next);
		return left>right?left+1:right+1;
	}
	public void deleteNode(int data) {
		Node move=root;Node tag=null;
		while(move!=null && move.data!=data)
		{
			tag=move;
			if(data >move.data)
				move=move.next;
			else move=move.pre;
		}
		if(move==null)
		{
			System.out.println("Element not present ...");
			return;
		}
		if(move.pre==null)
		{
			
			if(tag.data<move.data)
				tag.next=move.next;
			else 
				tag.pre=move.next;
		}
		else if(move.next==null)
		{
			if(tag.data>move.data)
				tag.pre=move.pre;
			else 
				tag.next=move.pre;
		}
		else if(move.pre!=null && move.next!=null)
		{
			Node temp=move.next;
			while(temp.pre!=null)
				temp=temp.pre;
			temp.pre=move.pre;
			if(tag.data<move.data)
				tag.next=move.next;
			else 
				tag.pre=move.next;
		}
	}
	public boolean search(int data) {
		Node move=root;
		while(move!=null && move.data!=data)
		{
			if(data >move.data)
				move=move.next;
			else move=move.pre;
		}
		if(move==null)
			return false;
		if(move.data==data)
		return true;
		else return false;
	}
	public void levelwise() {
	
	}
}
