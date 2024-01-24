package assi1;

import java.util.*;

public class PriorityQueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q1=new PriorityQueue<String>();
		q1.add("Rushikesh");
		q1.add("Welcome");
		q1.add("To");
		q1.add("Know-it");
		q1.add("Thank you");
		
		System.out.println(q1);
		int n=q1.size();
		for(int i=0;i<n;i++)
		{
			q1.remove();
			
		}
		System.out.println(q1.size());
	}

}
