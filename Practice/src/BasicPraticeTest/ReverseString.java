package BasicPraticeTest;

public class ReverseString {
public static void main(String[] args) {
	
	String str = "mynameissuniita";
	String s="";
	
	for(int i=0; i<str.length(); i++) {
		s= str.charAt(i)+s;
		System.out.println(s);
	
	}
	System.out.println("this is string" +s);
	
	
}
}
