class Account
{	
	private static float int_rate;
	private int acno;
	private float balance;
	static
	{
		int_rate=5.5f;
	}
	public Account(){}
	public Account(int acno,float balance)
	{
		this.acno=acno;
		this.balance=balance;
	}
	public void display()
	{
		System.out.println("Account no: "+acno+" Balance: "+balance);
	}
	public static void updateirate(float irate)
	{
		int_rate=irate;
	}
	public void displayBalance()
	{
		System.out.println("Account no: "+acno+" Updated Balance: "+(balance+balance*int_rate/100));
	}
}