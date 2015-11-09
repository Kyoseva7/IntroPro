
public class Zad2 {

	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		int min = arr[0][0];
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (min < arr[i][j]) {
					min = arr[i][j];
				}
				if (max > arr[i][j]) {
					max = arr[i][j];
				}

			}
		}
		System.out.println("nai-malkoto chislo e: " + min);
		System.out.println("nai-golqmoto chislo e: " + max);
	}
}
