package exceptionHandling2;

public class CStack {

	private int []arr;
	private int top,size;
	public CStack() {
		size=5;
		top=-1;
		arr=new int[size];
	}
	public CStack(int size) 
	{
		this.size = size;
		top=-1;
		arr=new int[size];
	}
	public void push(int no) throws StackOverflowException
	{
		if(top>size)
			throw new StackOverflowException();
		else 
		{
			top++;
			arr[top]=no;
		}
	}
	public int pop() throws StackUnderflowException
	{
		if(top<0)
			throw new StackUnderflowException();
		else
		{
			int no=arr[top];
			top--;
			return no;
		}
	}
	public void display()
	{
		for(int i=0;i<size;i++)
		System.out.println(arr[i]);
	}
	
}
