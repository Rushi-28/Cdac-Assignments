package linearQueue;

import java.util.Arrays;

public class Linear {

	int size,front,rear;
	int arr[];
	public Linear() {
		super();
		this.size = 5;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
	}
	public Linear(int size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new int[size];
	}
	public void Enqueue(int a)
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
	public int Dequeue()
	{
		int data=-9999;
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
	@Override
	public String toString() {
		return "Linear Queue [size=" + size + ", front=" + front + ", rear=" + rear + ", arr=" + Arrays.toString(arr) + "]";
	}
	
}
