package Practice;

public class StringReversal {
	
	public static void main(String[] args) {
		
		String str = "sunita";
		String s = "";
		
		for(int i=0; i<str.length(); i++) {
				s=str.charAt(i)+s;
				System.out.println(s);
		}
		if (str.equals(s)) {
			System.out.println("the given string is palindrome ="+s);
		}else {
			System.out.println("not a plaindrome");
		}
	}

}
