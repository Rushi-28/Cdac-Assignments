package charStack;

public class Chardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cstack c=new Cstack(5);
		c.push('r');
		c.push('u');
		c.push('s');
		c.push('h');
		c.push('i');
		c.display();
		c.peek();
		c.pop();
		c.peek();
		c.pop();
		c.pop();
		c.pop();
		c.display();
		c.pop();
		c.display();
	}

}
