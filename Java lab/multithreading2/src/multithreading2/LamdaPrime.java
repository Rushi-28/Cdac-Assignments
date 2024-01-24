package multithreading2;

public class LamdaPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			
			for(int i=2;i<=100;i++) {
				boolean flag=false;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=true;
						break;
					}
				}
				if(flag==false)
					System.out.print(i+",");
			
			}
	
		};
		Thread t=new Thread(r);
		t.start();
	
	}

}
