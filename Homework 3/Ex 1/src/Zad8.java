import java.util.Scanner;

public class Zad8 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");
		String word = test.nextLine();
		
		System.out.println("Which symbol do you looking for");
		int n = test.nextInt();
				
		System.out.print("The N symbol of the word is: ");
		System.out.print(word.charAt(n));

	}

}
