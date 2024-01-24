package polyoffice.staff;

public class Admin extends Emp {
	private double bonus;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nBonus: "+bonus;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String name, int dd, int mm, int yy, int eid, double salary, double bonus) {
		super(name, dd, mm, yy, eid, salary);
		this.bonus = bonus;
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		return super.calSalary()+bonus;
	}
	
	

}
