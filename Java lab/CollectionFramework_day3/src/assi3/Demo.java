package assi3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any String : ");
		String s=sc.next();
		Map<Character, Integer> m1=new HashMap<>();
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(m1.containsKey(ch))
			{
				int n=m1.get(ch);
				m1.replace(ch, ++n);
			}
			else
				m1.put(ch, 1);
		}
		m1.forEach((Character ch,Integer n)->{System.out.println(ch+" : "+n);});
		
	}

}
