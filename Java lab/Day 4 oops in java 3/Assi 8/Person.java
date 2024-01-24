class Person
{
	private String name;
	private Date bday;
	public Person()
	{  this.name=new String("Not defined");
	   this.bday=new Date(); 
	}
	public Person(String name,int dd,int mm,int yy)
	{  this.name=new String(name); 
	   this.bday=new Date(dd,mm,yy); 
	}
	public void display()
	{
		System.out.println("Person Name: "+name);
		bday.ShowDate();
	}
}
class Date
{
	private static int cnt;
	private int dd,mm,yy;
	public Date(){	cnt++; System.out.println(cnt+" th Object of date class is Created");}
	public Date(int dd,int mm,int yy)
	{	this.dd=dd;this.mm=mm;this.yy=yy; cnt++; System.out.println(cnt+" th Object of date class is Created");}
	public Date(Date d)
	{	this.dd=d.dd;this.mm=d.mm;this.yy=d.yy;	cnt++; System.out.println(cnt+" th Object of date class is Created");}
	public void ShowDate()
	{	System.out.println(dd+"/"+mm+"/"+yy);}
}