
public class Zad1 {

	public static void main(String[] args) {
		int[][] Arr = new int[][] { { 8, 77, 4, 2 }, { 1, 3, -9, 58 }, { -99, -85, -84, 2 }, { 6, -8, 18, 44 } };
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr[i].length; j++) {
				if (Arr[i][j] % 2 == 0) {
					System.out.println(Arr[i][j]);
				}
			}
		}
	}

}
