package polyoffice.staff;

public class SalesManager extends Emp implements ITraveller{
	private int target;
	private double incetive;
	private int days;
	public SalesManager() {
		super();
		this.target = 1;
		this.incetive = 1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nTarget: "+target+"\nIncentives: "+incetive+"\nDays: "+days;
	}
	public SalesManager(int eid, double salary, int target, double incetive,int days) {
		super(eid, salary);
		this.target = target;
		this.incetive = incetive;
		this.days=days;
	}
	public SalesManager(String name, int dd, int mm, int yy, int eid, double salary, int target, double incetive,int days) {
		super(name, dd, mm, yy, eid, salary);
		this.target = target;
		this.incetive = incetive;
		this.days=days;
	}
	@Override
	public double calSalary() {
		return (super.calSalary()+(target*incetive));
	}
	@Override
	public float calculateTA() {
		// TODO Auto-generated method stub
		return days*da;
	}
	
}