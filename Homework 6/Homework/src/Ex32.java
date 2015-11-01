
public class Ex32 {

	public static void main(String[] args) {
		int[] Array = new int[] { 1, 3, 5, -5, -5, 5, 3, 1 };
		int j = 0;

		for (int i = Array.length - 1; i >= 0; i--) {
			if (Array[j] == Array[i]) {
				j++;
				if (i == 0){
					System.out.println("Masivut e simetrichen");
				}
			} else {
				System.out.println("Masivut ne e simetrichen");
				break;
			}
		}
	}

}
