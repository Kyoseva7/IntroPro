import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		Scanner test = new Scanner (System.in);
		
		System.out.println("Please enter an integer: ");
		int a = test.nextInt();
		
		System.out.println ("Please enter another integer: ");
		int b = test.nextInt();
		
		System.out.print ("a % b = ");
		System.out.println(a % b);

	}

}
