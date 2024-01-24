package file2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assi4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw=new FileWriter("D:/New folder/StringPattern.txt");
		System.out.println("Stop to Exit");
		String str;
		while(!((str=br.readLine()).equalsIgnoreCase("Stop")))
		{
			fw.write(str);
			fw.write("\n");
		}
		
		fw.close();
		String big=null;
		int longlength=0,loop;
		BufferedReader fr=new BufferedReader(new FileReader("D:/New folder/StringPattern.txt"));
		while((str=fr.readLine())!=null)
		{
			if(str.length()>longlength)
				{
				longlength=str.length();
				big=str;
				}
	
		}
		fr.close();
		BufferedReader fr1=new BufferedReader(new FileReader("D:/New folder/StringPattern.txt"));
		while((str=fr1.readLine())!=null)
		{
			if(str.length()<longlength)
			{
				loop=longlength-str.length();
				for(int i=0;i<loop;i++)
				{
					System.out.print("-");
				}
				System.out.print(str);
				System.out.println();
			}
			else System.out.println(str);
			
			
		}
		fr.close();
		br.close();
	}

}
