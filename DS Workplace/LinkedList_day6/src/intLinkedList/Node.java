package intLinkedList;

public class Node {
	int data;
	Node link;
	public Node() {
		this.data = 1;
		this.link =null;
	}
	public Node(int data) {
		super();
		this.data = data;
		this.link =null;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	
}
