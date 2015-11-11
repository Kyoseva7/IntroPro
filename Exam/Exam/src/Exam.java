import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete chislo ot 2 do 9: ");
		int a = input.nextInt();
		while (a < 2 || a > 9) {
			System.out.println ("Opitai pak");
			System.out.println("Vuvedete chislo ot 2 do 9: ");
			a = input.nextInt();
		}
		
		int[][] matrix = new int[a][a];
		int count = 0;
		for (int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				count++;
			}
		}
		
		int[] arr = new int[count];
		System.out.println("Vuvedete stoinostite na ednomerniq masiv: ");
		for (int i = 0; i < arr.length; i++){
			arr[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum = sum + arr[i];
		}
		System.out.println("Sumata na vsichki elementi e = " + sum);
		
		int n = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[j][i] = arr[n];
				n++;
			}
		}
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		input.close();
	}
}
