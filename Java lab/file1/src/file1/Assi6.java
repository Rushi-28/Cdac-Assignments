package file1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Assi6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int cnt=0;
		String line="";
		System.out.println("Enter File Name to insert data: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File f=new File(br.readLine());
		Writer wf=new FileWriter(f.getName());
		//InputStreamReader is=new FileReader(f.getName());
		String str;
		System.out.println("Enter Input: ");
		while(!((str=br.readLine()).equals("Stop")))
		{
			wf.write(str);
			wf.write("\n");
		}
		wf.close();
		InputStreamReader is=new FileReader(f.getName());
		int n;
		while((n=is.read())!=-1)
		{
			line+=(char)n;
			if((char)n=='\n')
			{
				
				System.out.println(cnt+"");
				System.out.print(line);
				cnt++;
			}

		}
		br.close();
		is.close();
	}

}

