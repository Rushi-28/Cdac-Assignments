package IntLinkedlist;

public class Node {
	 int data;
	 Node next;
	public Node() {
		this.data = 1;
		this.next = null;
	}
	@Override
	public String toString() {
		return data + " ";
	}
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
