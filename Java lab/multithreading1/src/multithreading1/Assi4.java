package multithreading1;

public class Assi4 implements Runnable {
	private int num;
	private Thread t;
	public Assi4(int num)
	{
		t=new Thread(this);
		this.num=num;
	}
	
	public Thread getT()
		{
			return t;
		}
	@Override
	public void run() {
		for(int i=num;i>=0;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
