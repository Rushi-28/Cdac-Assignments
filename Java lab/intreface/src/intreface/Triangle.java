package intreface;

public class Triangle implements Drawable {
	private float base,height;

	public Triangle(float  base,float height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Triangle() {
		
	}
	@Override
	public void drawshape() {
		// TODO Auto-generated method stub
		System.out.println("Its Triangle. ");
	}
	@Override
	public float calarea() {
		// TODO Auto-generated method stub
		return (0.5f*base*height);
	}
	
}
