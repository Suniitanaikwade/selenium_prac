package StringMethods;

public class PracticeStringMethod {
	public static void main(String[] args) {
		String str = "Sunita is mad woman";
		String a= "sUnita";
		
		str.charAt(0);
		System.out.println("this is charat method=" +str.charAt(0));
		
		str.codePointAt(0);
		System.out.println("this is codepointat method=" +str.codePointAt(0));
		
		str.codePointBefore(3);
		System.out.println("this is codepointbefore method=" +str.codePointBefore(3));
		
		str.codePointCount(0, 2);
		System.out.println("this is codepointat method=" +str.codePointCount(0, 2));
		
		str.compareTo(a);
		System.out.println("this is compare to method=" +str.compareTo(a));
		
		str.compareToIgnoreCase(str);
		System.out.println("this is compare to ignore case method=" +str.compareToIgnoreCase(str));
		
		str.concat(a);
		System.out.println("this is concat method=" +str.concat(a));
		
		str.contains(str);
		System.out.println("this is contains method=" +str.contains(a));
		
		str.contentEquals(str);
		System.out.println("this is contentequal method=" +str.contentEquals(str));
		
		//str.copyValueOf(0);
		//System.out.println("this is copyvalue menthod" +str);
		//
	}

}
