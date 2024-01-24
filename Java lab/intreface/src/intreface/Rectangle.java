package intreface;

public class Rectangle implements Drawable {
	private float length,width;

	public Rectangle(float length,float width) {
		super();
		this.length = length;
		this.width = width;
	}
	public Rectangle() {}
	@Override
	public void drawshape() {
		// TODO Auto-generated method stub
		System.out.println("Its Rectangle. ");
	}
	@Override
	public float calarea() {
		float area;
		area=length*width;
		return area;
	}
	
	
}
