package file2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assi1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter File Name to check: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File f=new File(br.readLine());
		if(f.isDirectory())
		{
			System.out.println("This is Directory");
			File []arr=f.listFiles();
			System.out.println("This derectory has following files: ");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i].getName());
		}
		else if(f.isFile())
		{
			System.out.println("is a file");
			System.out.println("Size: "+f.length());
			if(f.length()>25)
			{
				BufferedReader brr=new BufferedReader(new FileReader(f));
				String str;
				while((str=brr.readLine())!=null)
				{
					System.out.println(str);
				}
				brr.close();
			}
			else {
				{
					InputStreamReader is= new InputStreamReader(System.in);
					System.out.println("Enter q to quit ");
					int n;
					while((n=br.read())!='q')
					{
						System.out.println((char)n);
					}
					is.close();
					
				}
			}
		}
		br.close();
	}

}
