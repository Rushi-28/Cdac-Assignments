class Greatest
{
	public static void main(String [] args)
	{
		int num1=25,num2=36,num3=17,max;
		max=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		System.out.println(max);
	}
}