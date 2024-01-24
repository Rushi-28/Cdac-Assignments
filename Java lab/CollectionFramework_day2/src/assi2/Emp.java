package assi2;

public class Emp implements Comparable<Emp>{
	public int eid;
	public String name;
	public float sal;
	public Emp(int eid, String name, float sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "\nEmp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Emp o) {
		
		return (int) (this.sal-o.sal);
	}
	
}