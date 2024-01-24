package file1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assi2 {

	public static void main(String[] args) {
		
				BufferedReader br=null;
				try {
					br=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter stop to quit ");
					String longstr;
					int max=0;
					String str;
					while(!((str=br.readLine()).equals("stop")))
					{
						System.out.println(str);
						if(max<str.length())
						{
							max=str.length();
							longstr=str;
						}
					}
					System.out.println("longest str lenth is : "+max);
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

