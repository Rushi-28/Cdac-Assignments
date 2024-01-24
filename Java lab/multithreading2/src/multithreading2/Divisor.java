package multithreading2;

import java.io.FileWriter;
import java.io.IOException;

public class Divisor implements Runnable{
	private Thread t;
	private FileWriter f;
	private int num=0;

	
	public Divisor(FileWriter f, int num) {
		super();
		this.f = f;
		this.num = num;
		this.t=new Thread(this);
	}
	public Thread getT()
	{
		return t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (f) {
			
		
			
		try {
			f.write("Divisors of "+num+" : ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=1;i<=num;i++)
		{
		if(num%i==0)
			try {
				f.write(i+",");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}
	
}
