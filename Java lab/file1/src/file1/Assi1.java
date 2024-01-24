package file1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter q to quit ");
			int n;
			while((n=br.read())!='q')
			{
				System.out.println((char)n);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				br.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

}
