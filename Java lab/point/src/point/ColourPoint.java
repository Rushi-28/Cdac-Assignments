package point;

public class ColourPoint extends Point{
	public String colour;
	public static String []colours;
	static
	{
		colours=new String [7];
		colours[0]="red";
		colours[1]="grey";
		colours[2]="blue";
		colours[3]="black";
		colours[4]="green";
		colours[5]="orange";
		colours[6]="purple";
	}
	
	public ColourPoint(String colour) {
		super();
		this.colour = colour;
	}
	public ColourPoint(int x, int y, String colour) throws InvalidColourException {
		super(x, y);
		boolean flag=false;
		for(String s:colours )
		{
			if(s.equalsIgnoreCase(colour))
			{
				this.colour=colour;
				flag=true;
				break;
			}
		}
		if(flag==false)
			throw new InvalidColourException();
	}
	public ColourPoint(int y, String colour) {
		super(y);
		boolean flag=false;
		for(String s:colours )
		{
			if(s.equalsIgnoreCase(colour))
			{
				this.colour=colour;
				flag=true;
				break;
			}
		}
		if(flag==false)
			this.colour="white";
	}
	@Override
	public String toString() {
		
		return super.toString()+"\nColour: "+colour;
	}
	

}
