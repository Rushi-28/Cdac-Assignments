package polyoffice.staff;

public class Programmer extends Emp implements ITraveller{

	private double extraHrs,charges;
	private int days;

	public Programmer() {
		super();
	}

	public Programmer(String name, int dd, int mm, int yy, int eid, double salary, double extraHrs, double charges,int days) {
		super(name, dd, mm, yy, eid, salary);
		this.extraHrs = extraHrs;
		this.charges = charges;
		this.days=days;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nExtra hours: "+extraHrs+"\nCharges per hour: "+charges+"\nDays: "+days;
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return (super.calSalary()+(extraHrs*charges));
	}

	@Override
	public float calculateTA() {
		// TODO Auto-generated method stub
		return da*days;
	}
	
}
