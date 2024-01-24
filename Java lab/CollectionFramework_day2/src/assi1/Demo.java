package assi1;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(11, "Dhiraj", "Beed", 95.55f);
		Student s2=new Student(12, "Om", "Pune", 85.55f);
		Student s3=new Student(13, "Ram", "mumbai", 40.36f);
		Student s4=new Student(14, "Sham", "pune", 96.11f);
		//Student s5=new Student(11, "sita", "nashik", 73.21f);
		Student s6=new Student(16, "gita", "pune", 95.55f);
		Student s7=new Student(17, "rushi", "nashik", 28.3f);
		Student s8=new Student(18, "raj", "pune", 63.21f);
		Student s5=new Student(11, "dhiraj", "beed", 73.21f);
		
		HashSet <Student> hs=new HashSet<Student>();
		hs.add(s8);
		hs.add(s7);
		hs.add(s6);
		hs.add(s5);
		hs.add(s4);
		hs.add(s3);
		hs.add(s2);
		hs.add(s1);
		hs.add(s8);
		
		System.out.println(hs);
		
		}

}
