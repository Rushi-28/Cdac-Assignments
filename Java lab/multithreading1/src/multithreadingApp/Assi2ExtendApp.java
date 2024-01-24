package multithreadingApp;

import multithreading1.Thread2extend;

public class Assi2ExtendApp {

	public static void main(String[] args) {
		
		Thread t=new Thread2extend();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread : "+i);
			try {
				t.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
