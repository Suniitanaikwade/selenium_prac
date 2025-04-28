package Collection;

public class Array {
	public static void main(String[] args) {
		int a [] =new int[10];  // declare an array
		a[0]=1;                 // initialize an array	
		a[11]=2;
		String s="";
		for (int i : a) {
			if(i!=0)
			s=s+i;
		}
	System.out.println("this is arrey vaues= " +s);
	System.out.println(a.length);
		
	}
	
	

}
