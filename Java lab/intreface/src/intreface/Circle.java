package intreface;

public class Circle implements Drawable{
	private float radius;

	public Circle(float f) {
		super();
		this.radius = f;
	}

	public Circle() {
		this.radius = 1;
	}

	@Override
	public void drawshape() {
		System.out.println("Its Circle. ");
	}

	@Override
	public float calarea() {
		float area;
		area=pi*radius*radius;
		return area;
	}
	
	
}
