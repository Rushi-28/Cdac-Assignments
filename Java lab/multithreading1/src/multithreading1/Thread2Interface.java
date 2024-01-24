package multithreading1;

public class Thread2Interface implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Thread : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
