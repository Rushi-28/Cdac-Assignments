package intrefaceApp;

import intrefaceAssi4.MarksCompare;
import intrefaceAssi4.NameCompare;
import intrefaceAssi4.ObjCompare;
import intrefaceAssi4.Student;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []s= new Student[5];
		s[0]= new Student(11,"Dhiraj",98.9f);
		s[1]= new Student(12,"Sham",55.1f);
		s[2]= new Student(13,"Ram",87.9f);
		s[3]= new Student(14,"Om",66.35f);
		s[4]= new Student(15,"Sita",37.25f);
		
		ObjCompare o=new NameCompare();
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(o.Compare(s[i],s[j])>0)	
				{
					Student temp;
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			
		}
		for(Student e: s)
		{
			System.out.println(e);
		}
		System.out.println("********************");
		
		ObjCompare p=new MarksCompare();
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(p.Compare(s[i],s[j])>0)	
				{
					Student temp;
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			
		}
		for(Student e: s)
		{
			System.out.println(e);
		}
	}
	
}
