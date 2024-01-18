package graph;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Nodes in Graph: ");
		int node=sc.nextInt();
		Graph g=new Graph(node);
	
		System.out.println("Enter No of edges in Graph: ");
		int edge=sc.nextInt();
		for(int i=0;i<edge;i++)
		{
			System.out.println("Enter 2 of edges in Graph: ");
			int no1=sc.nextInt();
			int no2=sc.nextInt();
			g.addEdge(no1, no2);
		}
		
		g.display();
		g.inDegree();
		g.outDegree();
		System.out.println("Enter Start point in Graph(< "+node+" : ");
		int start=sc.nextInt();
		g.DFS(start);
		
	}

}