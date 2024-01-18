package circularQueue;

public class CircularQueue {
	int size,front,rear;
	int arr[];
	public CircularQueue() {
		super();
		this.size = 5;
		this.front = -1;
		this.rear = -1;
		this.arr =new int[size];
	}
	public CircularQueue(int size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr =new int[size];
	}
	public boolean isFull()
	{	
		if(front==(rear+1)%size)
			return true;
		else
		return false;
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		else
		return false;
	}
	public void enQueue(int a)
	{
		if(!isFull())
		{
			if(front==-1)
				front=0;
			rear=(rear+1)%size;
			arr[rear]=a;
		}
		else System.out.println("Queue is Full.......");
	}
	public int deQueue()
	{
		int data=-9999;
		if(!isEmpty())
		{
			data=arr[front];
			if(front==rear)
				front=rear=-1;
			else front=(front+1)%size;
		}
		return data;
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("Queue is Empty........");
		else
		{
			int i;
			System.out.println("\n********Queue Is : *********\n");
			for(i=front;i!=rear;i=(i+1)%size)
				System.out.print(arr[i]+"  ");
			if(i==rear)
				System.out.print(arr[i]+"\t");
		}
	}
}


