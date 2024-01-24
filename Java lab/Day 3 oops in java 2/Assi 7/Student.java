class Student
{
	//private const char name[20];
	private int id;
	private float percentage;
	public Student(){ id=1;percentage=1;}
	public Student(/*const char ch[],*/int id,float per)
	{
		//strcpy(name,ch);
		this.id=id;
		percentage=per;
	}
	public Student(Student s)
	{
		//strcpy(this.name,s.name);
		this.id=s.id;
		this.percentage=s.percentage;
	}
	public void Display()
	{	System.out.println("Student: "/*+name+" "*/+id+" "+percentage);}
	public void Grade()
	{
		if(percentage>=90 && percentage<100)
		System.out.println("Student Grade : Excellent");
		else if(percentage>=80 && percentage<90)
		System.out.println("Student Grade : Very Good");
		else if(percentage>=70 && percentage<80)
		System.out.println("Student Grade : Good");
		else if(percentage>=60 && percentage<70)
		System.out.println("Student Grade : Average");
		else if(percentage>=40 && percentage<60)
		System.out.println("Student Grade : Pass");
		else if(percentage<40)
		System.out.println("Student Grade : Fail");
	}
}