
public class Zad4 {

	public static void main(String[] args) {
		int[][] Arr = new int[5][6];
		int a = 30;
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				Arr[i][j] = a;
				a--;
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
