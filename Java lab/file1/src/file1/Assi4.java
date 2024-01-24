package file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Assi4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter File Name to insert data: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File f=new File(br.readLine());
		Writer wf=new FileWriter(f.getName());
		//InputStreamReader is=new FileReader(f.getName());
		String str;
		System.out.println("Enter Input: ");
		while(!((str=br.readLine()).equals("Stop")))
		{
			wf.write("\n");
			wf.write(str);
		}
		wf.close();
		InputStreamReader is=new FileReader(f.getName());
		int n;
		while((n=is.read())!=-1)
		{
			System.out.print((char)n);
		}
		br.close();
		is.close();
	}

}

