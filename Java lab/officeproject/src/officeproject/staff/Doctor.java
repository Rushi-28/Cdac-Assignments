package officeproject.staff;

public class Doctor extends Emp {
	private String degree;

	public Doctor() {
		super();
		degree="Bhms";
	}

	public Doctor(String name, int dd, int mm, int yy, int eid, double salary,String degree) {
		super(name, dd, mm, yy, eid, salary);
		this.degree=degree;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Degree: "+degree);
	}
	
}
