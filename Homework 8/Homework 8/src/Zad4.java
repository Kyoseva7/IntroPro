import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete 3 celi chisla: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int max = maxNumber(a, b);
		maxNumber(max, c);
		System.out.print(maxNumber(max,c));
		input.close();
	}

	public static int maxNumber(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
