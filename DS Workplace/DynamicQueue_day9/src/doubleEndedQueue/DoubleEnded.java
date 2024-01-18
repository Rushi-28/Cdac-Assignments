package doubleEndedQueue;

public class DoubleEnded {
	Node front,rear;
	public DoubleEnded() {
		front=rear=null;	}
	public void enQueueFront(int data)
	{
		Node n1=new Node(data);
		if(front==null)
		front=rear=n1;
		else
		{
			n1.next=front;
			front =n1;
		}
	
	}
	public void enQueueRear(int data)
	{
		Node n1=new Node(data);
		if(front==null)
		front=rear=n1;
		else
		{
			rear.next=n1;
			rear=n1;
		}
	}
	public boolean isEmpty()
	{
		return front==null?true:false;
	}
	public int deQueueFront()
	{
		if(isEmpty())
		{
			return -9999;
		}
		else 
		{
			int data;
			if(front.next==null)
			{
				data=front.data;
				front=rear=null;
			}
			else
			{
				data=front.data;
				front=front.next;
			}
			 
			return data;
		}
		
	}
	public int deQueueRear()
	{
		int data = 0;
		if(isEmpty())
		{
			return -9999;
		}
		else {
			if(front.next==null)
			{
				data=front.data;
				front=rear=null;
			}
			else
			{
				Node move=front;
				while(move.next!=rear)
				{
					data=rear.data;
					rear=move;
					rear.next=null;
					move=move.next;
				}
				
			}
			return data;
		}
	}
	public String toString()
	{
		if(isEmpty())
		{
			System.err.println("Queue is Empty...");
			return "";
		}
		
		else
		{
			String str=" " ;
			Node move=front;
			while(move!=null)
			{
				str+=move.data+" ";
				move=move.next;
			}
			return str;
		}
		
	}
}
