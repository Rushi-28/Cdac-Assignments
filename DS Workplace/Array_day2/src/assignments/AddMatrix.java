package assignments;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr1= {{1,2,3},{11,12,13},{21,22,23},{1,2,3}};
		int [][]arr2= {{10,20,30},{10,20,30},{10,20,30},{1,2,3}};
		display(arr1);
		display(arr2);
		add(arr1,arr2);
	}

	private static void add(int[][] arr1, int[][] arr2) {
		// TODO Auto-generated method stub
		int [][]ar=new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				ar[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		display(ar);
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
}
