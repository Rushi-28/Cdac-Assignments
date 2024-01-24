package file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Assi5 {

	public static void main(String[] args) throws Exception {
	
				// TODO Auto-generated method stub
				
				System.out.println("Enter New File Name to copy data: ");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				File f1=new File(br.readLine());
				
				System.out.println("Enter File Name whose data to be copy: ");
				File f2=new File(br.readLine());
				
				Writer wf=new FileWriter(f1.getName());
				
				InputStreamReader is=new FileReader(f2.getName());
				String str;

			/*	while(!((str=br.readLine()).equals("Stop")))
				{
					wf.write(str);
				}
				wf.close();
				InputStreamReader is=new FileReader(f.getName());*/
				int n;
				while((n=is.read())!=-1)
				{
					
					wf.write((char)n);
				}
				br.close();
				is.close();
				wf.close();
			}
}

