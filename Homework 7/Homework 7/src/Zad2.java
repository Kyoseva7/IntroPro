import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislata na masiva:");
		int[][] Arr = new int[3][4];
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				Arr[i][j] = input.nextInt();
			}
		}
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
