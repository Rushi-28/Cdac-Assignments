package multithreading2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number : ");
		int num=Integer.parseInt(br.readLine());
		FileWriter fw=new FileWriter("D:/New folder/Divisor.txt");
		Divisor d=new Divisor(fw, num);
		d.getT().start();
		Divisor d1=new Divisor(fw,63);
		d1.getT().start();
		Divisor d2=new Divisor(fw,630);
		d2.getT().start();
		try {
			d.getT().join();
			d1.getT().join();
			d2.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fw.close();
	}

}
