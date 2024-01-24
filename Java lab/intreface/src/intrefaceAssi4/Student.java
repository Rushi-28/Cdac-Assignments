package intrefaceAssi4;

public class Student{
	private int sid;
	private String name;
	private float marks;
	public Student() {
	}
	
	public Student(int sid, String name, float marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nStudent Id: "+sid+"\nStudent Name: "+name+"\nStudent Marks: "+marks;
	}

	public int getSid() {
		return sid;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}
	
}
