package multithreadingAssi3;

public class StockDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stock s=new Stock();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.getT().start();
		c.getT().start();
		Thread.sleep(100);
		p.stopNow();
		c.stopNow();
		p.getT().join();
		c.getT().join();
		System.out.println("Total qnty Produce : "+s.qtyProduce);
		System.out.println("Total qnty Consume : "+s.qtyConsume);
	}

}
