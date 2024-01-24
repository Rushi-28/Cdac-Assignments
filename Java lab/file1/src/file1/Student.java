package file1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Id: ");
		int sid=Integer.parseInt(br.readLine());
		System.out.println("Enter Student Name: ");
		String name=br.readLine();
		System.out.println("Enter Student Marks");
		float marks=Float.parseFloat(br.readLine());
		
		System.out.println("Student id: "+sid);
		System.out.println("Student Name: "+name);
		System.out.println("Student marks: "+marks);
	}
	

}
