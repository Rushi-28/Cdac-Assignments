package priorityQueue;

public class Element {

	int data;
	int priority;
	public Element(int data, int priority) {
		super();
		this.data = data;
		this.priority = priority;
	}
	public Element() {
		super();
		this.data = 5;
		this.priority = 5;
	}
	@Override
	public String toString() {
		return "Element [data=" + data + ", priority=" + priority + "]";
	}
	
	
	
}
