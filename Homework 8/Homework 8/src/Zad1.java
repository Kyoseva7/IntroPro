import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete ime: ");
		String ime = input.nextLine();
		greetName(ime);
		input.close();
	}

	public static void greetName(String name) {
		System.out.println("Greetings, " + name);
	}
}
