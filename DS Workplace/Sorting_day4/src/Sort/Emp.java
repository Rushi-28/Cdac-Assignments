package Sort;

public class Emp {

	private int eno;
	private String ename;
	private float sal;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int eno, String ename, float sal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.sal = sal;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nEmployee no: "+eno+"\nEmployee name: "+ename+"\nSalary: "+sal;
	}
	public float getSal() {
		return sal;
	}
	
	
}
