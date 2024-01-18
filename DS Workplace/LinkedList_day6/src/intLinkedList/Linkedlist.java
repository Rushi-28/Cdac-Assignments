package intLinkedList;

public class Linkedlist {
	Node head;
	public void createLinlList(int size)
	{
		int no=5;
		for(int i=0;i<size;i++)
		{
			addNode(no);
			no=no+5;
		}
	}
	public void addNode(int no) {
		Node record=new Node(no);
		if(head==null)
			head=record;
		else
		{
			Node move;
			for(move=head;move.link!=null;move=move.link);
			move.link=record;
		}
		
	}
	public void display()
	{
		Node move;
		for(move=head;move.link!=null;move=move.link)
		System.out.print(move.data+" " );
		if(move.link==null)
			System.out.print(move.data);
	}
}
