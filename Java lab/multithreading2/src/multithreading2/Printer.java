package multithreading2;

public class Printer {
	public void Printer(String a,String b,String c)
	{
		synchronized (this) {
			

		try
		{
			System.out.print(a);
			Thread.sleep(500);
			System.out.print(b);
			Thread.sleep(500);
			System.out.print(c);
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			e.getMessage();
		}
		}
	}

}
