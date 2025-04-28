package Practice;

// 0,1,1,2,3,5,8,13,21,34  adding with previous number

public class FabonacciSeries {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3;
		int i;
		int count = 10;
		System.out.print(n1 + "" + n2); // print 0 and 1

		for (i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print("" + n3);
			n1 = n2;
			n2 = n3;

		}

	}

}
