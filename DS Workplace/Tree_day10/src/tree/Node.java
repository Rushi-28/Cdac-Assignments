package tree;

public class Node {

	 int data;
	 Node next,pre;
	 public Node(int d)
	 {
		 data=d;
		 next=pre=null;
	 }
	@Override
	public String toString() {
		return " [ " + data + " ] ";
	}
	
}
