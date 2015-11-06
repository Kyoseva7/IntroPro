import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int[][] Matrix = new int[4][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete 16 chisla: ");
		for (int row = 0; row < Matrix.length; row++) {
			for (int col = 0; col < Matrix[row].length; col++) {
				Matrix[row][col] = input.nextInt();
			}
		}
		for (int row = 0; row < Matrix.length; row++) {
			for (int col = 0; col < Matrix[row].length; col++) {
				if (Matrix[row][col] % 2 != 0) {
					Matrix[row][col] = Matrix[row][col] * 2;
				}
				System.out.print(Matrix[row][col] + " ");
			}
			System.out.println();
		}
		input.close();
	}

}
