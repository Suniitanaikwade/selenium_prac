package BasicPraticeTest;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int n =17;
		String number="";
		
		for(int i=2;i<n-1;  i++) {
			
			if(n%i==0) {
				System.out.println("not a prime number");
			}
			else if (n%i==1) {
				number=n+","+number;
				System.out.println("prime number"+number);
			}
		}
	}
	 

}