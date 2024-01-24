package multithreadingAssi3;

public class Consumer implements Runnable {

			private Thread t;
			Stock s;
			boolean bRun;
			public Consumer(Stock s)
			{
				this.s=s;
				this.t=new Thread(this);
				this.bRun=true;
			}
			public Thread getT()
			{
				return t;
			}
			public void run() {
				// TODO Auto-generated method stub
				while(bRun)
					s.consume();
			}
			public void stopNow()
			{
				bRun=false;
			}
	}

