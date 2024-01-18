package assignments;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2,3},{11,12,13},{21,22,23}};
		display(arr);
		trans(arr);
		
	}

	private static void trans(int[][] arr) {
		// TODO Auto-generated method stub
		int [][]ar=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				ar[j][i]=arr[i][j];
			}
		
		}
		display(ar);
	}

	public static void display(int[][] arr)
	{
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
