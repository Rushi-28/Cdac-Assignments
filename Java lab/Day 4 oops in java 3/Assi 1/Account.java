class Account
{
	private int acno;
	private float balance;
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
}