package intrefaceAss2;

public class MyNum implements IntOperation {
	
	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2!=0)
		return true;
		else return false;
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num%2==0)
			return true;
		else return false;
	}
	@Override
	public boolean isPrime(int num) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int i;
		for( i=2;i<num;i++)
		{
			if(num%i==0)
			{	flag=true;
			break;
			}
		}
		return flag;
	}

	@Override
	public int factorial(int num) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	

}

