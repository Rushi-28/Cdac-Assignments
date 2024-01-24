package assi1;

import java.util.Objects;

public class Student {
	public int sid;
	public String name;
	public String city;
	public float perc;
	public Student(int sid, String name, String city, float perc) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
		this.perc = perc;
	}
	@Override
	public String toString() {
		return "\nStudent [sid=" + sid + ", name=" + name + ", city=" + city + ", perc=" + perc + "]";
	}
	@Override
	public int hashCode() {
		int temp=0;
		if(city.equalsIgnoreCase("pune"))
			temp=10;
		else if(city.equalsIgnoreCase("Mumbai"))
			temp=20;
		else if(city.equalsIgnoreCase("nashik"))
			temp=30;
		else temp=40;
		return temp;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s1 = (Student) obj;
			if(this.sid==s1.sid && this.name.equalsIgnoreCase(s1.name) && this.city.equalsIgnoreCase(s1.city))
				return true;
		}
		return false;
	}
	
}
