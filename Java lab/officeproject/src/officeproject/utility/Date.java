package officeproject.utility;

public class Date {
		private int dd,mm,yy;

		public Date(int dd, int mm, int yy) {
			super();
			this.dd = dd;
			this.mm = mm;
			this.yy = yy;
		}

		public Date() {		}
		
		public void showdate()
		{
			System.out.println(dd+"/"+mm+"/"+yy);
		}
}
