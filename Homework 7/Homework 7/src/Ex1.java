
public class Ex1 {

	public static void main(String[] args) {
		int Matrix[][] = new int[4][4];
		int n = 0;
		for (int row = 0; row < Matrix.length; row++) {
			for (int col = 0; col < Matrix[row].length; col++) {
				Matrix[row][col] = n;
				n--;
			}
		}
		for (int row = 0; row < Matrix.length; row++) {
			for (int col = 0; col < Matrix[row].length; col++) {
				System.out.print(Matrix[row][col] + " ");
			}
			System.out.println();
		}
	}

}
