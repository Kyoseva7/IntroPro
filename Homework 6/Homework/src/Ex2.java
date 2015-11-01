
public class Ex2 {

	public static void main(String[] args) {
		int[] Array = new int[] { 1, 453, 7, 67, 88, -998, 54, 66 };
		int[] Array2 = new int[Array.length];
		int j = 0;

		for (int i = Array.length - 1; i >= 0; i--) {
			Array2[j] = Array[i];
			System.out.println("Array2[" + j + "] = " + Array2[j]);
			j++;
		}
	}
}
