package polyoffice;

import polyoffice.staff.*;
import polyoffice.util.*;

public class polyOfficeApp extends Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Emp e1=new Emp();
		Emp e2=new Emp("Rushi",28,7,2000,101,50500.5);
		Person p1=new Emp();
		Person p2=new Emp("Dhiru",28,3,2000,102,80500.5);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(p1.toString());
		System.out.println(p2.toString());*/
		Emp[] e=new Emp[3];
		
			e[0]=new SalesManager("Dhiru",28,03,2000,101,20000.5,10,500,25) ;
			e[1]=new Programmer("Rushi",28,07,2000,102,40000,20,500,23);
			e[2]=new Admin("Ram",15,11,2000,103,15000,1000);
			
			for(Emp s: e)
			{
				System.out.println(s);
				System.out.println("Net Salary: "+s.calSalary());
				System.out.println();
			}
			for(Emp s: e)
			{
				System.out.println("Salary of employee having id "+s.getEid()+" is "+s.calSalary());
				if(s instanceof ITraveller)
					System.out.println("Travelling Allowances : "+((ITraveller)s).calculateTA());
				else System.out.println("Travelling Allowances : Not Allowed");
			}
	}
}
