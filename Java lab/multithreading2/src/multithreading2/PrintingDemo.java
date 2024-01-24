package multithreading2;

public class PrintingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p=new Printer();
		PrintingTask t=new PrintingTask("{","Welcome To Know-it", "}", p);
		PrintingTask t1=new PrintingTask("[","Lets start Cpp", "]", p);
		PrintingTask t2=new PrintingTask("-","It will end in 15 days", "-", p);
		t.getT().start();
		t1.getT().start();
		t2.getT().start();
	}

}
