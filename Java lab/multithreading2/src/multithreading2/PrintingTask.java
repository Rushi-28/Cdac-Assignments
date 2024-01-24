package multithreading2;

public class PrintingTask implements Runnable{
	private Thread t;
	private String header,body,footer;
	private Printer p;
	
	public PrintingTask(String header, String body, String footer, Printer p) {
		super();
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.p = p;
		this.t=new Thread(this);
	}
	public Thread getT()
	{
		return t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.Printer(header, body, footer);
	}
	
}
