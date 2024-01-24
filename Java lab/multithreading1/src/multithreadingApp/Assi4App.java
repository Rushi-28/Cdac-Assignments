package multithreadingApp;

import multithreading1.Assi4;

public class Assi4App {

	public static void main(String[] args) {
	
		Assi4 t=new Assi4(15);
		Assi4 t1=new Assi4(17);
		Assi4 t2=new Assi4(25);
		t.getT().start();
		t1.getT().start();
		t2.getT().start();

	}

}
