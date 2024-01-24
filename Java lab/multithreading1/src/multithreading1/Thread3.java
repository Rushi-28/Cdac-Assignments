package multithreading1;

public class Thread3 implements Runnable{

	private Thread t;
	public Thread3()
	{
		t=new Thread(this);
	}
	public Thread getT()
	{
		return t;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread3 : "+i);
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}


/*2. Create a thread for just printing numbers from 1 to 5. 
Make the thread sleep in between for 500 ms. Create the instancefrom main thread.
 (Use Thread class as well as Runnable interface for creating thread) */