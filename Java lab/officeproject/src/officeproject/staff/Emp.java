package officeproject.staff;

import officeproject.utility.Date;
import officeproject.utility.Person;

public class Emp extends Person {
	private int eid;
	private double salary;
	public Emp() {
		super();
	}
	public Emp(int eid, double salary) {
		super();
		this.eid = eid;
		this.salary = salary;
	}
	public Emp(String name,int dd, int mm, int yy,int eid, double salary) {
		super(name,dd,mm,yy);
		this.eid = eid;
		this.salary = salary;
	}
	public void display()
	{	
		super.display();
		System.out.println("Employee id : "+eid+"\nSalary : "+salary);
	}
}
