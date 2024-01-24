package polyoffice;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import polyoffice.staff.Emp;


public class EmpFileWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Emp []empty=new Emp[3];
		
		ObjectInputStream is=new ObjectInputStream(new FileInputStream("D:\\Java lab\\file2\\Emp.txt"));
		
		for(int i=0;i<empty.length;i++)
		{
			Object o=is.readObject();
			if(o instanceof Emp)
				empty[i]=(Emp)o;
			System.out.println(empty[i]);
			System.out.println();
		}
		is.close();
	}
}
