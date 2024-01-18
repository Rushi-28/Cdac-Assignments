package stringLinkedList;

public class LinkedList {
	Node head;

	public void addEnd(String str) {
		Node record=new Node(str);
		if(head==null)
			head=record;
		else
		{
			Node move;
			for(move=head;move.link!=null;move=move.link);
			move.link=record;
		}
		
	}

	public void addBeg(String str) {
		Node record=new Node(str);
		if(head==null)
			head=record;
		else
		{
			record.link=head;
			head=record;
		}
	}

	public boolean contains(String str) {
		boolean flag=false;
		Node move;
		for(move=head;move.link!=null;move=move.link)
		{
			if(move.str.equalsIgnoreCase(str))
			{
				return true;
			}
		}
		return flag;
	}

	public int size() {
		if(head==null)
			return 0;
		else {
				int cnt=0;
				Node move;
				for(move=head;move.link!=null;move=move.link)
				{
					cnt++;
				}
				return cnt+1;
		}
	}

	public void modify(int index, String str1) {
		if(index<=0 || index>size())
		System.out.println("Index not present in linked list");	
		else
		{
			Node move=head;
			for(int i=1;i<index;i++)
				move=move.link;
			move.str=str1;
		}
	}

	public void modify(String str, String str1) {
		boolean flag=false;
		Node move;
		for(move=head;move.link!=null;move=move.link)
		{
			if(move.str.equalsIgnoreCase(str))
			{
				move.str=str1;
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("String not present....");
		
	}

	public void display() {
		if(head==null)
			System.out.println("Linked List is empty ");
		else
		{
			Node move;
			for(move=head;move.link!=null;move=move.link)
				System.out.print(move.str+"\t");
			if(move.link==null)
				System.out.println(move.str);
		}
	}
	
}
