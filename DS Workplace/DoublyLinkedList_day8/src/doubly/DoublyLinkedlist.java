package doubly;

public class DoublyLinkedlist {

	class Node{
		int data;
		Node next;
		Node prev;
		public Node() {
			this.data = -1;
			this.next = null;
			this.prev=null;
		}
		
		public Node(int data) {
			super();
			this.data = data;
			prev=next = null;
		}
	}
	
		Node head;
		public DoublyLinkedlist()
		{
			head=null;
		}
		public int size()
		{
			if(head==null)
			return 0;
			else
			{
				int cnt=1;
				Node move=head;
				while(move!=null)
				{
					cnt++;
					move=move.next;
				}
				return cnt;
			}
		}
		public void addNode(int data)
		{
			Node n1=new Node(data);
			if(head==null)
				head=n1;
			else
				{
					Node move=head;
					while(move.next!=null)
						move=move.next;
					move.next=n1;
					n1.prev=move;
				}
		}
		public void insert(int pos,int data)
		{
			int cnt=size();
			if(pos<=0 || pos>cnt+1)
				System.out.println("Envalid Position Can not insert at this Position");
			else
			{
				Node n1=new Node(data);
				if(pos==1)
					{
						if(head==null)
						{
							head=n1;
						}
						else
						{
							n1.next=head;
							head.prev=n1;
							head=n1;
						}
					}
				else
					{
						Node move=head;
						for(int i=1;i<pos-1;move=move.next,i++);
						n1.next=move.next;
						if(n1.next!=null)
						n1.next.prev=n1;
						move.next=n1;
						n1.prev=move;
					}
			}
		}
		public void delete(int data)
		{
			if(head.data==data)
			{
				if(head.next==null)
				{
					head=null;
				}
				else
				{
					head=head.next;
					head.prev=null;
					
				}
			}
			else
			{
				Node move;
				for(move=head;move.next.data!=data;move=move.next);
				Node del=move.next;
				if(del.next!=null)
					del.next.prev=move;
				move.next=del.next;
				del=null;		
			}
		}
		public void printReverse()
		{
			Node curr=head;
			while(curr.next!=null)
				curr=curr.next;
			while(curr!=null)
			{
				
				System.out.print(curr.data+" ");
				curr=curr.prev;
			}
		}
		public void modify(int data,int newdata)
		{
							Node n1=new Node(newdata);
				if(head.data==data)
					{
						
							
							n1.next=head.next;
							head=n1;
					}
				else
					{
						Node move=head;
						while(move.next.data!=data)
						{
							move=move.next;
						}
						n1.next=move.next.next;
						if(n1.next!=null)
						n1.next.next.prev=n1;
						move.next=n1;
						n1.prev=move;
					}
				 
		}
		public void display()
		{
			Node move=head;
			while(move!=null)
			{
				System.out.print(move.data+" ");
				move=move.next;
			}

			
		}
		public String tostring()
		{
			String str="  ";
			Node move;
			for(move=head;move!=null;move=move.next)
			{
				str=str+move.data;
			}
				
			return str;
		}
	}

