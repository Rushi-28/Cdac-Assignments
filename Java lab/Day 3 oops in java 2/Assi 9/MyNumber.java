class MyNumber
{	
	private int num;
	public MyNumber(){}
	public MyNumber(int num){ this.num=num; }
	public boolean isNegative(){
	boolean flag=false;
	if(num<0)
	flag=true;
	return flag;
	}
	public boolean isPositive(){
	boolean flag=false;
	if(num>0)
	flag=true;
	return flag;
	}
	public boolean isZero(){
	boolean flag=false;
	if(num==0)
	flag=true;
	return flag;
	}
	public boolean isOdd(){
	boolean flag=false;
	if(num%2!=0)
	flag=true;
	return flag;
	}
	public boolean isEven(){
	boolean flag=false;
	if(num%2==0)
	flag=true;
	return flag;
	}
}