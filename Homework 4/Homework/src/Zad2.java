import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your points - from 1 to 9: ");
		int a = input.nextInt();
		
		if(a>=1 && a<=3){
			System.out.print( a + " * 5 = ");
			System.out.println(a * 5);			
			
		} else if (a>=4 && a<=6){
			System.out.print( a + " * 10 = ");
			System.out.println(a * 10);		
			
		} else if (a>=7 && a<=9){
			System.out.print( a + " * 50 = ");
			System.out.println(a * 50);		
			
		} else {
			System.out.println ("Your points are not from 1 to 9");
		}
		input.close ();

	}

}
