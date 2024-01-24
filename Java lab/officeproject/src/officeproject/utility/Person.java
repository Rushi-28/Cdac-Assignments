package officeproject.utility;

public class Person {
	private String name;
	private Date bdate;
	public Person(String name, Date bdate) {
		this.name = name;
		this.bdate = bdate;
	}
	public Person(String name, int dd,int mm,int yy) {
		this.name = name;
		this.bdate = new Date(dd,mm,yy);
	}
	public Person() {
		name="Not given";
		bdate=new Date();
	}
	public void display()
	{
		System.out.println("Name: "+name);
		bdate.showdate();
	}

}
