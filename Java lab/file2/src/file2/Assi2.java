package file2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assi2 {

	public static void main(String[] args){
		
				BufferedReader br=null;
				BufferedReader brr=null;
				try {
					System.out.println("Enter file name : ");
					br=new BufferedReader(new InputStreamReader(System.in));
					File f=new File(br.readLine());
					brr=new BufferedReader(new FileReader(f));
					
					String longstr=null;
					int max=0;
					String str;
					while(((str=brr.readLine())!=null))
					{
						System.out.println(str);
						if(max<str.length())
						{
							max=str.length();
							longstr=str;
						}
					}
					System.out.println("longest str is : "+longstr);
					System.out.println("&its length is : "+max);
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
						brr.close();
					}
					catch(IOException e)
					{
						System.out.println(e.getMessage());
					}
				}
				
			}


	}

