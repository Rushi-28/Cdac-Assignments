package multithreading1;

public class Thread2extend extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread2 : "+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
