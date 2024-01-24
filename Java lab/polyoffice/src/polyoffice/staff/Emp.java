package polyoffice.staff;

import polyoffice.util.Person;

public class Emp extends Person {
	private int eid;
	private double salary;
	public Emp() {
		super();
	}
	public int getEid() {
		return eid;
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
	public String toString() {
		return super.toString()+"\nEmpid : "+eid+"\nSalary : "+salary;
	}
	public void display()
	{	
		super.display();
		System.out.println("Employee id : "+eid+"\nSalary : "+salary);
	}
	public double calSalary()
	{
		return salary;
	}
}
