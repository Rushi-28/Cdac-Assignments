package stringLinkedList;

public class Node {
	String str;
	Node link;
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Node(String str) {
		super();
		this.str = str;
		this.link = null;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
}
