package circular;

public class LinkedList {
	Node head;
	
	public void addBeg(int data)
	{
		Node n1=new Node(data);
		if(head==null)
		{
			head=n1;
			n1.setLink(head);
		}
		else
		{
			n1.setLink(head);
			Node move;
			for(move=head;move.getLink()!=head;move=move.getLink());
			move.setLink(n1);
			head=n1;
		}
		
	}
	public void addEnd(int data)
	{
		Node n1=new Node(data);
		if(head==null)
		{
			head=n1;
			n1.setLink(head);
		}
		else
		{
			Node move=head;
			while(move.getLink()!=head)
				move=move.getLink();
			move.setLink(n1);
			n1.setLink(head);
		}
		
		
	}
	public void addMid(int pos,int data)
	{
		int cnt=size();
		if(pos<=0 || pos>cnt+1)
			System.out.println("Invalid position");
		else
		{
			if(pos==1)
				addBeg(data);
			else if(pos==cnt+1)
				addEnd(data);
			else
			{
				Node n1=new Node(data);
				Node move=head;
				for(int i=1;i<pos-1;i++)
				{
					move=move.getLink();
				}
				n1.setLink(move.getLink());
				move.setLink(n1);
			}
		}
		
		
	}
	public void deleteBeg(int data)
	{
		if(head.getLink()==head)
			head=null;
		else
		{
			Node move=head;
			while(move.getLink()!=head)
			{
				move=move.getLink();
			}
			move.setLink(head.getLink());
			head=head.getLink();
		}
		
	}
	public void deleteEnd(int data)
	{
		if(head.getLink()==head)
			head=null;
		else
		{
			
		}
	}
	public void deleteMid(int pos)
	{
		
	}
	public void display()
	{
		Node move=head;
		while(move.getLink()!=head)
		{
			System.out.print(move.getData()+" ");
			move=move.getLink();
		}
		System.out.print(move.getData()+" ");
	}
	public int size()
	{
		if(head==null)
			return 0;
		int cnt=1;
		Node move=head;
		while(move!=head)
		{
			move=move.getLink();
			cnt++;
		}
		return cnt;
	}
	
}
