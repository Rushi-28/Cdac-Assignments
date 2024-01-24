package intrefaceApp;

import intreface.Circle;
import intreface.Rectangle;
import intreface.Triangle;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle(5.2f,6.3f);
		Triangle t1=new Triangle(3.0f,5.1f);
		Circle c1=new Circle(10.2f);
		t1.drawshape();
		System.out.println("Area: "+t1.calarea());
		r1.drawshape();
		System.out.println("Area: "+r1.calarea());
		c1.drawshape();
		System.out.println("Area: "+c1.calarea());
	}

}
