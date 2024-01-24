class RealNo
{
	private int re,img;
	public RealNo(){}
	public RealNo(int re,int img)
	{	this.re=re;this.img=img;	}
	public void Display()
	{
		if(img>=0)
		System.out.println(re+"+"+img+"i");
		else 	
		System.out.println(re+""+img+"i");
	}
}
