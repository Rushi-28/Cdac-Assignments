class StudentDemo
{
	public static void main(String [] args)
	{
		Student s1,s2,s3,s4,s5,s6;
		s1=new Student();
		s2=new Student(/*"Rushi",*/10,97.36f);
		s3=new Student(s2);
		s4=new Student(/*"Dhiraj",*/11,85.69f);
		s5=new Student(/*"Bhushan",*/12,56.58f);
		s6=new Student(/*"Ram",*/13,35.25f);
		s1.Grade();
		s2.Grade();
		s3.Grade();
		s4.Grade();
		s5.Grade();
		s6.Grade();
	}
}
		