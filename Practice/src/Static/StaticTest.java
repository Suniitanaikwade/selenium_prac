package Static;

public class StaticTest {

	static {
		System.out.println("this is static block"); // static is a keyword which will create the memory to load the data
	}
	static {
		System.out.println("this is static block2");
	}

	static {
		System.out.println("this is static block3");

	}

	StaticTest() {
		System.out.println("this is StaticTest Constructor");  //contructor name should be by your class name
	}

	StaticTest(String a) {
		System.out.println("this is StaticTest Constructor2");
	}

	StaticTest(int a) {
		System.out.println("this is StaticTest Constructor3");
	}

	public static void test() {
		System.out.println("this is static method");
	}

	public static void test(int b) {
		System.out.println("this is static method2");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		StaticTest.test();                            // classname.methodname 
		StaticTest.test(0);
		
		StaticTest st =new StaticTest();
		StaticTest st1= new StaticTest("ty");
		StaticTest st2 = new StaticTest(0);
		
		 
	}
}
