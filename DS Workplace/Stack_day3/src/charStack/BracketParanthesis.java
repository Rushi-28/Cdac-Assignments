package charStack;

import java.util.Scanner;

public class BracketParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		str=sc.next();
		if(isbalance(str))
			System.out.println("String is Balanced");
		else System.out.println("Not Balance");
	}

	private static boolean isbalance(String str) {
		boolean flag=true;
		Cstack cs=new Cstack(str.length());
		char ch,op;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='['||ch=='{'||ch=='('||ch=='<')
				cs.push(ch);
			else if(ch==']'||ch=='}'||ch==')'||ch=='>')
				{
					op=cs.pop();
					if(ch==']'&& op!='['||ch=='}'&op!='{'||ch==')'&&op!='('||ch=='>'&&op!='<')
					{
						flag=false;
					}
						
				}	
		}
		if(!cs.isEmpty())
			flag=false;
		return flag;
	}

}
