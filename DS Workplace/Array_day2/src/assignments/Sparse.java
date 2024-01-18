package assignments;

public class Sparse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{0,0,0,1,0,0},{0,0,6,0,0,0},{0,0,0,0,0,0},{8,0,0,0,0,0},{0,0,0,0,0,3},{0,0,0,0,7,0},{0,5,0,0,0,0}};
		display(arr);
		sparse(arr);
	}
	private static void sparse(int[][] arr) {
		// TODO Auto-generated method stub
		int nonzero=cntdigit(arr);
		int res[][]=new int[nonzero+1][3];
		res[0][0]=arr.length;
		res[0][1]=arr[0].length;
		res[0][2]=nonzero;
		int k=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]!=0)
				{
					res[k][0]=i;
					res[k][1]=j;
					res[k++][2]=arr[i][j];
				}
			}
		}
		display(res);
	}
	public static void display(int[][] arr)
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	private static int cntdigit(int [][]arr) {
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]!=0)
				{
					cnt++;
				}
			}
		}
		return cnt;
	}
}
