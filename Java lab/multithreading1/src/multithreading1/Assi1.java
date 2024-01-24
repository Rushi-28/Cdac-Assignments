package multithreading1;

public class Assi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Thread name : "+t.getName());
		System.out.println("Its priority : "+t.getPriority());
	}

}



/*1. Show the name and priority of default thread that gets created in any java application.

2. Create a thread for just printing numbers from 1 to 5. 
Make the thread sleep in between for 500 ms. Create the instancefrom main thread.
 (Use Thread class as well as Runnable interface for creating thread) 
 
3. Repeat above assignment for declaring Thread controller within the the class implementing Runnable.

4. Create a thread for counting down the number from a perticular number to zero.
 Create 3 thread instances from main thread and make the main thread stop after all the thread 
 executes completely.

Create a thread for copying the contents from source file to destination file. 
Accept source file name and destination file name from the user in main thread 
and pass it to other thread.

6. Create a thread for printing prime numbers in the given range. 
Accept the start and end number from user in main thread and pass it to the child thread.*/