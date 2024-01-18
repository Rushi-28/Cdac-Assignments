package IntLinkedlist;


public class LinkedList {
	Node head;

	public LinkedList() {
		head=null;
	}
	public void addNode(int data)
	{
		boolean flag=true;
		Node res=new Node(data);
		if(head==null)
			head=res;
		else if(head.data>=data)
		{
			res.next=head;
			head=res;
		}
		else {
			Node move;
			for(move=head;move.next!=null;move=move.next)
			{
				
				if(move.data<data && move.next.data>=data)
				{
					res.next=move.next;
					move.next=res;
					flag=false;
				}	
			}
			if(flag)
				move.next=res;
		}
	}
	public void addEnd(int data)
	{
		Node res=new Node(data);
		if(head==null)
			head=res;
		else {
			Node move;
			for(move=head;move.next!=null;move=move.next);
					move.next=res;
		}
	}
	
	public void addBeg(int data) 
	{
		Node res=new Node(data);
		if(head==null)
			head=res;
		else
		{
			res.next=head;
			head=res;
		}
	}
	
	
	
	public boolean search(int data) {
		boolean flag=false;
		Node move;
		for(move=head;move.next!=null;move=move.next)
		{
			if(move.data==data)
			{
				return true;
			}
		}
		return flag;
		
	}
	public int size() {
		if(head==null)
			return 0;
		else {
				int cnt=0;
				Node move;
				for(move=head;move.next!=null;move=move.next)
				{
					cnt++;
				}
				return cnt+1;
		}
	}
	public void delete(int data) {
		boolean flag=false;
		Node move;
		if(head.data==data)
			{
			head=head.next;
			flag=true;
			}
		else {
			move=head;
			while(move.next!=null)
			{
				if(move.next.data==data)
				{
					Node res=move.next;
					move.next=res.next;
					res=null;
					flag=true;
				}
				move=move.next;
			}
		}
		if(flag==false)
			System.out.println("No data inserted is available");
	}
	public void insert(int data,int pos) {
		int size=size();
		Node res=new Node(data);
		if(pos<0 || pos>size+1)
		{
			System.out.println("Invalid position cannot insert data");
		}
		else
		{
			if(pos==1)
			{
				res.next=head;
				head=res;
			}
			else {
				Node move=head;
				int i;
				for(i=1;i<pos-1;i++)
					move=move.next;
				res.next=move.next;
				move.next=res;
			}
		}
	}
	public void display()
	{
		if(head==null)
			System.out.println("Linked List is empty ");
		else
		{
			Node move;
			for(move=head;move.next!=null;move=move.next)
				System.out.print(move.data+"\t");
			if(move.next==null)
				System.out.println(move.data);
		}
	}
	public void sorted()
	{
		Node temp=head;
		while(temp!=null)
		{
			Node move=temp.next;
			while(move!=null)
			{
				if(temp.data>move.data)
				{
					int dt=temp.data;
					temp.data=move.data;
					move.data=dt;
				}
				move=move.next;
			}
			temp=temp.next;
		}
		display();
	}
	public void addBoth(int data) {
	
		addEnd(data);
		addBeg(data);
	
	}
	public void reverse() {
		Node p1=head;
		Node p2=head.next;
		while(p2!=null)
		{
			Node p3=p2.next;
			p2.next=p1;
			p1=p2;
			p2=p3;
		}
		head.next=null;
		head=p1;

	}
	public void split() {
		LinkedList l1=new LinkedList();
		LinkedList l2=new LinkedList();
		Node move=head;
		while(move!=null)
		{
			if(move.data%2==0)
				l1.addNode(move.data);
			else
				l2.addNode(move.data);
			move=move.next;
			
		}
		l1.display();
		l2.display();
	}
	public void merge(LinkedList n1,LinkedList n2) {
		int cnt1=n1.size();
		int cnt2=n2.size();
		int netcnt=cnt1+cnt2;
		n1.display();
		n2.display();
		LinkedList l1=new LinkedList();
		Node move1=n1.head;
		Node move2=n2.head;
		for(int i=0;i<=netcnt-1;i++)
		{
			if(i%2==0)
			{
				l1.addNode(move1.data);move1=move1.next;
			}
			else
			{
				l1.addNode(move2.data);move2=move2.next;
			}
			
			
		}
		l1.display();
	}
	public int findMid() {
		Node move1=head;
		Node move2=head;
		while(move2.next!=null &&move2!=null)
		{
			move1=move1.next;
			move2=move2.next.next;
		}
		return move1.data;
		
	}
	
}
