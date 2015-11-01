import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] Arr = new int[]{23,2,54,66,55,76,76,44,33,-4,-65,5,-93,4,5,2};
		
		System.out.println("Vuvedete tursenoto chislo: ");
		int a = input.nextInt();
		
		for (int i = 0; i < Arr.length; i++){
			if (Arr[i] == a){
				System.out.println("Tursenoto chislo e: Arr[" + i + "] = " + Arr[i]);
				break;
			}
		}
		input.close();
	}

}
