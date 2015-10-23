import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		
		System.out.println("Please enter a word");
		String word1 = test.nextLine();
		
		System.out.println("Please enter another word");
		String word2 = test.nextLine();
		
		System.out.print("You wrote: ");
		System.out.println(word1 + " " + word2);

	}

}
