import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		
		String Right = "Hello";
			
		System.out.print ("Looking for ");
		System.out.println (Right);
		
		System.out.println("Enter e word ");
		String New = test.nextLine();
		
		boolean RightmeansNew = Right.equals(New);
	
		System.out.println(RightmeansNew);
		
			
		

	}

}
