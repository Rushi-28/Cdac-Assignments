package polyoffice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import polyoffice.staff.Admin;
import polyoffice.staff.Emp;
import polyoffice.staff.Programmer;
import polyoffice.staff.SalesManager;

public class EmpFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Emp []e= {new SalesManager("Dhiru",28,03,2000,101,20000.5,10,500,25) ,
		new Programmer("Rushi",28,07,2000,102,40000,20,500,23),
		new Admin("Ram",15,11,2000,103,15000,1000)};
		
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("D:\\Java lab\\file2\\Emp.txt"));
		
		for(Emp s: e)
		{
			os.writeObject(s);
		}
		os.close();
	}
}
