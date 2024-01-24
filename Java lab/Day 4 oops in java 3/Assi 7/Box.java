import java.util.Scanner;
class Box
{
	private float [][]b=new float [3][3];
	private float res=1;
	Scanner sc=new Scanner(System.in);
	public Box(){
	for(int i=0;i<b.length;i++)
	{	System.out.println("Enter Length width and Height");
		for(int j=0;j<b[i].length;j++){
		
		b[i][j]=sc.nextInt();
		/*b[i][j]=sc.nextInt();
		b[i][j]=sc.nextInt();*/}}
	}
	public void display()
	{	for(int i=0;i<b.length;i++)
		{
		for(int j=0;j<b[i].length;j++){
		System.out.print(b[i][j]+" ");}
		System.out.println();
		}
	}
	private float []vol=new float [3];
	public void Volume()
	{	
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++){
		res*=b[i][j];
		}
	vol[i]=res;
	res=1;
	}}
	public void printvolume(){
	for(int i=0;i<vol.length;i++)
		System.out.println("Volume of box "+(i+1)+" is "+vol[i]);}
	
}