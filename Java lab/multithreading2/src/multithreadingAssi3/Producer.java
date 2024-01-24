package multithreadingAssi3;

public class Producer implements Runnable {

	private Thread t;
	private Stock s;
	private boolean bRun;
	
	
	public Producer(Stock s) {
		this.s=s;
		this.t=new Thread(this);
		this.bRun=true;
	}
	public Thread getT()
	{
		return t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(bRun)
			s.produce();
	}
	public void stopNow()
	{
		bRun=false;
	}
}
