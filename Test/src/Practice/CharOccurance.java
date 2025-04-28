package Practice;

// print occurance of character from the given string

// s=1
//u=1
//n=1
//i=2
//t=1
//a=1

public class CharOccurance {

	public static void main(String[] args) {
		String str = "suniita";
		char[] array = str.toCharArray(); // initializing the array & store the string

		for (int i = 0; i < str.length(); i++) {
			//System.out.println(array[i]);
			int count = 0;
			char a = array[i];
			// Declare the character to store
			for (int j = 0; j < str.length(); j++) {

				if (a == array[j]) {
					count++;

				}

			}
			System.out.println(a + "=" + count);

		}
	}
}
