package multithreading1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assi5 implements Runnable{
	String fileS,fileD;
	Thread t;
	public Assi5(String fileS,String fileD) {
		this.fileS=fileS;
		this.fileD=fileD;
		t=new Thread(this);
	}
	public Thread getThread()
	{
		return t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		BufferedWriter bw=null;
		try
		{
			br=new BufferedReader(new FileReader(fileS));
			bw=new BufferedWriter(new FileWriter(fileD));
		String str;
		while(((str=br.readLine())!=null))
		{
			bw.write(str);
			bw.write("\n");
		}
		
				
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
