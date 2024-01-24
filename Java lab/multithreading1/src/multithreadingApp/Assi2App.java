package multithreadingApp;

import multithreading1.Thread2Interface;

public class Assi2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Thread2Interface();
		Thread t=new Thread(r);
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
