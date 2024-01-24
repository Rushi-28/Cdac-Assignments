package polyoffice.util;

import java.io.Serializable;

public class Date implements Serializable{
	private int dd,mm,yy;

	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public Date() {		}
	public String tostring()
	{
		return dd+"/"+mm+"/"+yy;
	}
	public void showdate()
	{
		System.out.println();
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}
