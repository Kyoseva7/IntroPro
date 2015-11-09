
public class Ex4 {

	public static void main(String[] args) {
		String abc = "Baraban";
		reverseChar(abc);
	}

	public static void reverseChar(String word) {
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
	}
}
