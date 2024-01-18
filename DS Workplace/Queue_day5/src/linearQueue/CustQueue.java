package linearQueue;

public class CustQueue {
	int size,front,rear;
	Customer arr[];
	public CustQueue(int size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new Customer[size];
	}
	public CustQueue() {
		super();
		// TODO Auto-generated constructor stub
		this.size = 3;
		this.front = -1;
		this.rear = -1;
		this.arr = new Customer[size];
	}
	public void Enqueue(Customer a)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=rear+1;
			arr[rear]=a;
		}
		else System.out.println("Queue is Full.....");
	}
	public Customer Dequeue()
	{
		Customer data=null;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else
				front++;
		}
		return data;
	}
	public boolean isFull()
	{
		if(rear==size-1)
			return true;
		else return false;
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else return false;
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("Queue is empty.....");
		else {
					System.out.println("\n**********QUEUE IS: *****************\n");
					for(int i=front;i<=rear;i++)
					{
						System.out.print(arr[i]+" ");
					}
			}
		
	}
}
