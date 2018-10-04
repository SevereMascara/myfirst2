import java.util.Scanner;
public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		// A
		System.out.println("A");
		n = 3;
		while(n < 25){
			System.out.println(n);
			sum += n;
			n++;
		}
		System.out.println(sum + "\n");
		
		//B
		System.out.println("B");
		n = 2;
		do {
			System.out.println(n);
			n += 2;
		} while (n < 35);
		
		//C
		System.out.println("\nC");
		for (int x = 29; x > 0; x -=2){
			System.out.println(x);
		}
		
		//D
		System.out.println("\nD");
		System.out.println("Two Characters");
		String alpha = scan.next();
		String bravo = scan.next();
		System.out.println("An Integer");
		int cindy = scan.nextInt();
		for(int x = 0; x < cindy; x++){
			System.out.print(alpha + " ");
		} System.out.println();
		for(int x = 0; x<cindy; x++){
			System.out.println(bravo);
		}
		
		//E
		System.out.println("\nE");
		System.out.println("Four int");
		int[] danny = new int[4];
		sum = -9999999;
		int winner = 0;
		for (int erica: danny){
			erica = scan.nextInt();
			sum += erica;
			if (erica > sum){
				winner = erica;
			}
			System.out.println(sum);
			System.out.println(winner);
		}
		n = 0;
		
		//F
		System.out.println("\nF");
		System.out.println("Doubles until 7.2");
		sum = 0;
		int loser = 999999;
		while (n
	
	}

}
