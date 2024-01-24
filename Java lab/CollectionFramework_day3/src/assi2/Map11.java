package assi2;

import java.util.HashMap;
import java.util.Map;

public class Map11 {
	public static void main(String[] args) {
		Map<Integer,String>m1=new HashMap<Integer, String>();
		m1.put(1, "Om");
		m1.put(5, "Ram");
		m1.put(9, "sham");
		m1.put(3, "Geeta");
		m1.put(7, "Seeta");
		
		System.out.println(m1);
	
		m1.forEach((Integer n,String s)->{System.out.println(n+" : "+s);});
	}
	
	
}
