package Polymorphisam;

public class TestOverloading {
	
	public static void main(String[] args) {
		
	// Overloading v=new Overloading();
		
	 Overloading o = new Overriding();
	
		char x = 'a';
		double y=123;
		
		//v.s1();
		//v.s1(0);
		//v.s1("S");
		//v.s1(x);
		//v.s1(y);
		
		o.s1();
		o.s1("rte");
		o.s1(7);
		o.s1(x);
		o.s1(y);
	}

}
