package exceptionHandling2;

public class Assi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CStack cs=new CStack(5);
		try
		{cs.push(10);
		cs.push(20);
		cs.push(30);
		cs.push(11);
		cs.push(22);
		cs.display();
		}
		catch(StackOverflowException e)
		{
			System.out.println(e);
		}
		
		try
		{
		System.out.println("Deleted element: "+cs.pop());	
		System.out.println("Deleted element: "+cs.pop());
		System.out.println("Deleted element: "+cs.pop());
		System.out.println("Deleted element: "+cs.pop());
		cs.display();
		}
		catch(StackUnderflowException e)
		{
			System.out.println(e);
		}
	}

}
