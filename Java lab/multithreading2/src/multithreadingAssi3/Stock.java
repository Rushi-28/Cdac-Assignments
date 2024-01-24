package multithreadingAssi3;

public class Stock {

	int qtyProduce;
	int qtyConsume;
	boolean bProduce;
	
	public Stock() {
		this.qtyProduce = 0;
		this.qtyConsume = 0;
		this.bProduce = false;
	}
	public synchronized void produce()
	{
		if(bProduce)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		qtyProduce++;
		System.out.println("Produced : "+qtyProduce);
		bProduce=true;
		notify();
		
	}
	public synchronized void consume()
	{
		if(!bProduce)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		qtyConsume++;
		System.out.println("Produced : "+qtyConsume);
		bProduce=false;
		notify();
		
	}
}
