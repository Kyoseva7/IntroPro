import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		
		Scanner test = new Scanner (System.in);
		
		System.out.println ("Please enter the side of the triangle ");
		int a = test.nextInt();
		
		System.out.println ("Please enter the height of the triangle ");
		int ha = test.nextInt();
		
		double S = (a * ha)/2;
		
		System.out.print("S = ");
		System.out.println(S);

	}

}
