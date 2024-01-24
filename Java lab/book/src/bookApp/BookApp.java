package bookApp;

import java.util.Scanner;

import book.Book;
import book.Ebook;
import book.PaperBook;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int book;
		Book []b=new Book[5];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book you want to purchase: \n1.Rich dad & Poor dad\n2Agnipankh\n3.Mahabharat\n4.Ramayana\n5.Bhagvat Gita");
		book=sc.nextInt();
		
			System.out.println("Enter Type of book you want to purchase: \n1.Ebook\n2Paper Book\n");	
			a=sc.nextInt();
			if(book==1 && a==1)
			{
				b[0]=new Ebook(101,"Rich dad & Poor dad",800.5);
				System.out.println(b[0]);
				System.out.println("final cost: "+b[0].calculatecost());
			}
			if(book==1 && a==2)
			{
				b[0]=new PaperBook(101,"Rich dad & Poor dad",800.5);
				System.out.println(b[0]);
				System.out.println("final cost: "+b[0].calculatecost());
			}
			if(book==2 && a==1)
			{
				b[1]=new Ebook(102,"Agnipankh",1202.6);
				System.out.println(b[1]);
				System.out.println("final cost: "+b[1].calculatecost());
			}
			if(book==2 && a==2)
			{
				b[1]=new PaperBook(102,"Agnipankh",1202.6);
				System.out.println(b[1]);
				System.out.println("final cost: "+b[1].calculatecost());
			}
			if(book==3 && a==1)
			{
				b[2]=new Ebook(103,"Mahabharat",403.2);
				System.out.println(b[2]);
				System.out.println("final cost: "+b[2].calculatecost());
			}
			if(book==3 && a==2)
			{
				b[2]=new PaperBook(103,"Mahabharat",403.2);
				System.out.println(b[2]);
				System.out.println("final cost: "+b[2].calculatecost());
			}
			if(book==4 && a==1)
			{
				b[3]=new Ebook(104,"Ramayana",702.65);
				System.out.println(b[3]);
				System.out.println("final cost: "+b[3].calculatecost());
			}
			if(book==4 && a==2)
			{
				b[3]=new PaperBook(104,"Ramayana",702.65);
				System.out.println(b[3]);
				System.out.println("final cost: "+b[3].calculatecost());
			}
			if(book==5 && a==1)
			{
				b[4]=new Ebook(105,"Bhagvat Gita",6000.25);
				System.out.println(b[4]);
				System.out.println("final cost: "+b[4].calculatecost());
			}
			if(book==5 && a==2)
			{
				b[4]=new PaperBook(105,"Bhagvat Gita",6000.25);
				System.out.println(b[4]);
				System.out.println("final cost: "+b[4].calculatecost());
			}
			
		
	}

}
