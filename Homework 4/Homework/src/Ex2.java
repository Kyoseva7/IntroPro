import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please insert a word");
		String str = input.nextLine();

		System.out.print(str + "*");

		input.close();
	}

}
