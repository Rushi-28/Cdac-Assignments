class Box
{
	private float len,wid,hei,res;
	public Box(){}
	public Box(float len,float wid,float hei)
	{
		this.len=len;this.wid=wid;this.hei=hei;
	}
	public Box(Box b)
	{
		this.len=b.len;this.wid=b.wid;this.hei=b.hei;
	}
	public void Volume()
	{
		res=len*wid*hei;
		System.out.println("Volume of the box is "+res);
	}
}