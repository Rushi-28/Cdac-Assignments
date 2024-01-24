package officeproject;

import officeproject.staff.*;
import officeproject.utility.Date;
import officeproject.utility.Person;

public class main extends Emp {

	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp("Rushi",28,7,2000,101,50500.5);
		Person p1=new Emp();
		Person p2=new Emp("Dhiru",28,3,2000,102,80500.5);
		e1.display();
		e2.display();
		p1.display();
		p2.display();
		//Emp e3=new Person();
			Doctor d1=new Doctor();
			Doctor d2=new Doctor("Dhiru",28,3,2000,102,80500.5,"MBBS");
			d2.display();
			d1.display();
		}
	}


