package multithreadingApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import multithreading1.Assi5;

public class Assi5App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Path="D:\\New folder";
		System.out.println("Enter source file name : ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String fileS=br.readLine();
		System.out.println("Enter Destination file name : ");
		String fileD=br.readLine();
		Assi5 t=new Assi5(Path+"\\"+fileS,Path+"\\"+fileD);
		t.getThread().start();;
		
	}

}
