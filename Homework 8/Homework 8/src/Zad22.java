import java.util.Scanner;

public class Zad22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {
			System.out.println("Vuvedete 3 celi chisla: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int result = multiplyInt(num1, num2, num3);
			System.out.println(result);
		}
		input.close();
	}

	public static int multiplyInt(int a, int b, int c) {
		int mul = a * b * c;
		return mul;
	}
}
