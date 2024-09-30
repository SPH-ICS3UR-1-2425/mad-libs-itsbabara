import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Give me a day of the week ");
		System.out.println("give me a sport");
		String name = in.nextLine();
		System.out.println("give me a number: ");
		int score = in.nextInt();
		System.out.println("Give me a decimal number");
		Double decNumber = in.nextDouble();
		System.out.println ("Give me a name:");
		in.nextLine();
		String person1 = in.nextLine();
		System.out.println("give me another name:");
		String person2 = in.nextLine();
		//flush
		in.next();
		String place = in.nextLine();
		System.out.println("On "+dayoftheweek+" "person1+" and "+person2+");

	}

}