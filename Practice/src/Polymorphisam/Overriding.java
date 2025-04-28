package Polymorphisam;

public class Overriding extends Overloading {
	
	// TODO Print Sumit by using Overriding method
	
	@Override
	public void s1() {
		System.out.println("this is sumit");
	}
	@Override
	public void s1(String a) {
		System.out.println("this is sumit1");
	}
	@Override
 public void s1(int b) {
	System.out.println("this is sumit2");
}
	@Override
	public void s1(char c) {
		System.out.println("this is sumit3");
		
	}
	@Override
	public void s1(double d) {
		System.out.println("this is sumit4");
	}

}
