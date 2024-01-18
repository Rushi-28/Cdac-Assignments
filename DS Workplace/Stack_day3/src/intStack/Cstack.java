package intStack;

public class Cstack {
	private int top;
	private int size;
	private int[] arr;
	public Cstack(int size) {
		this.top = -1;
		this.size = size;
		arr=new int[size];
	}
	public Cstack() {
		this.top = -1;
		this.size = 3;
		arr=new int[size];
	}
	public void push(int a)
	{
		if(!isFull())
		{
			top++;
			arr[top]=a;
		}
	}
	public int pop()
	{
		int c=-99;
		if(!isEmpty())
		{
			c=arr[top];
			top--;

		}
		return c;
	}
	public boolean isFull()
	{
		if(top==size-1)
		return true;
		else return false;
	}
	public boolean isEmpty()
	{
		if(top==-1)
		return true;
		else return false;
	}
	public int peek()
	{
		int c=-99;
		if(!isEmpty())
		{
			c=arr[top];
		}
		return c;
	}
	public void display()
	{
		System.out.println("----------- Stack Is ---------");
		for(int i=top;i>=0;i--)
			System.out.println("\t"+arr[i]);
		
	}
}
