package Practice;

public class VowelsCount {

	public static void main(String[] args) {
		String s = "suniitaismad";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Total Number of vowels = " +count);
	}
}
