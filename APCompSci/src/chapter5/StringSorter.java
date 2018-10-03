package chapter5;
import java.util.Scanner;
public class StringSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three names");
		String alpha = scan.next();
		String bravo = scan.next();
		String cindy = scan.next();
		System.out.println("Results");
		String temp;
		if (alpha.compareTo(bravo) > 0){
			temp = alpha;
			alpha = bravo;
			bravo = temp;
		}
		
		
		if (bravo.compareTo(cindy) > 0){
			temp = bravo;
			bravo = cindy;
			cindy = temp;
		}
		
		if (alpha.compareTo(bravo) > 0){
			temp = alpha;
			alpha = bravo;
			bravo = temp;
		}
		System.out.println(alpha);
		System.out.println(bravo);
		System.out.println(cindy);
		scan.close();

	}

}
