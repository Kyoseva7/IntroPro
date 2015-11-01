
public class Zad1 {

	public static void main(String[] args) {
		int[] Arr = new int[] {-9,5,3,6,54,3,56,776,2,34,3,2};
		int sum = 0;
		
		for (int i = 0; i < Arr.length; i++){
			if (Arr[i] % 2 == 0){
				sum = sum + Arr[i];
			}
			if (i == Arr.length - 1){
				System.out.println("sumata e = " + sum);
			}
		}
	}

}
