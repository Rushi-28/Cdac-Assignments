package binarySearchTree;

public class Queue {
	QNode front,rear;
	public Queue()
	{
		front=rear=null;
	}
	public void enque(Node root)
	{
		QNode n1=new QNode(root.data);
		if(front==null)
			rear=front=n1;
		else
			{
				rear.next=n1;
				n1=rear;
			}
	}
	public boolean isEmpty()
	{
		if(rear==null)
			return true;
		else return false;
	}
	public Node dequeue()
	{
		int data;
		data=front.data;
		if(front==rear)
			front=rear=null;
		else
			front=front.next;
		return new Node(data);
	}
}
