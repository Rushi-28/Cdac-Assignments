package circular;

public class Node {
	private int data;
	private Node link;
	public Node(int data) {
		super();
		this.data = data;
		this.link = null;
	}
	@Override
	public String toString() {
		return " [ " + data + " ] ";
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
