package point;

public class Point {
	private int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
	}
	public Point( int y) {
		super();
		this.x = y;
		this.y = y;
	}

	public String toString() {
		return "Point :["+x+","+y+"]";
	}
	
}
