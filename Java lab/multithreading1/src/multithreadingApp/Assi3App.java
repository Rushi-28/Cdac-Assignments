package multithreadingApp;

import multithreading1.Thread3;

public class Assi3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread3 t=new Thread3();
		t.getT().start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread : "+i);
			try {
				t.getT().sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}