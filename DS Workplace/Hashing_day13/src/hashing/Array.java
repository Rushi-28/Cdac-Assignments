package hashing;

public class Array {
	int arr[];
	boolean flag[];
	int size;
	public Array(int size)
	{
		arr=new int [size];
		flag=new boolean[size];
		this.size=size;
	}
	public int hash(int x)
	{
		return x%size;
	}
	public void insert(int key)
	{
		int i=0;
		int location=hash(key);
		do
		{
			if(!flag[location])
			{
				arr[location]=key;
				flag[location]=true;
				return;
			}
			else
			{
				i++;
				location=(hash(key)+i)%size;
			}
				
		}while(i<size);
		System.out.println(" Hash Table Is Full !!! ");
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(flag[i])
				System.out.println(i+")"+arr[i]);
			else
				System.out.println(i+")-----");
		}
		
	}
	public int search(int key)
	{
		int location=hash(key);
		int i=0;
		do
		{
			if(arr[location]==key)
				return location;
			else
			{
				i++;
				location=(hash(key)+i)%size;
			}
			
		}while(i<size && flag[location]);
		return -1;
	}
}
