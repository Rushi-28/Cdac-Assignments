class AccountDemo
{
	public static void main(String []args)
	{
		Account a1=new Account();
		a1.display();
		a1.displayBalance();
		
		Account a2=new Account(15,2536.25f);
		a2.display();
		a2.displayBalance();
		
		Account.updateirate(6.5f);
		a1.displayBalance();
		a2.displayBalance();
		
	}
}