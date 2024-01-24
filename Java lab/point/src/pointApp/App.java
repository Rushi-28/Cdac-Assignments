package pointApp;

import point.ColourPoint;
import point.InvalidColourException;
import point.Point;

public class App {

	public static void main(String[] args) {
		
		try
		{
			ColourPoint p1=new ColourPoint(10,20,"pink");
			System.out.println(p1);
		}
		catch(InvalidColourException e)
		{
			System.out.println(e);
		}
		
		

	}

}
