package priorityQueue;

import java.util.Arrays;

public class Queue {
	int size,front,rear;
	Element arr[];
	public Queue(int size) {
		super();
		this.size = size;
		this.front = -1;
		this.rear = -1;
		this.arr = new Element[size];
	}
	public Queue() {
		super();
		this.size = 3;
		this.front = -1;
		this.rear = -1;
		this.arr = new Element[size];
	}
	public boolean isFull()
	{
		return rear==size-1?true:false;
	}
	public void enQueue(Element e)
	{
		if(isFull())
			System.err.println("Queue is Full....");
		else
		{
			if(front==-1)
				front=0;
			rear++;
			arr[rear]=e;
		
		for(int i=front;i<=rear;i++)
		{
			for(int j=front;j<rear;j++)
			{
				if(arr[j].priority<arr[j+1].priority)
				{
					Element temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		}
	}
	public boolean isEmpty()
	{
		return front==-1?true:false;
	}
	public Element deQueue()
	{
		Element e=null;
		if(isEmpty())
			System.err.println();
		else
		{
			e=arr[front];
			if(front==rear )
				front=rear=-1;
			else 
				front++;
		}
		return e;
	}
	@Override
	public String toString() {
		String str="";
		if(isEmpty())
			System.out.println("Queue is Empty....");
		else
			{
				for(int i=front;i<=rear;i++)
				{
					str+=arr[i]+" ";
				}
			}
		
		return str;
	}
	
	
}
