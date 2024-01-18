package dynamic;

public class Queue {

	Node front, rear;

	public Queue() {
		front=rear=null;
	}
	public boolean isEmpty()
	{	
		return front==null?true:false;
		
	}
	public void enQueue(int data)
	{
		Node n1=new Node(data);
		if(front==null)
			rear=front=n1;
		else
		{
			rear.next=n1;
			rear=n1;
		}
				
	}
	public int deQueue() {
		if(isEmpty())
		{
			return -9999;
		}
		int data=front.data;
		front=front.next;
		return data;
	}
	public String toString()
	{
		String str=" ";
		Node move=front;
		while(move!=null)
		{
			str+=move.data+" ";
			move=move.next;
		}
		return str;
	}
}
