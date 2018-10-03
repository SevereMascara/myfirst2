package chapter4;
import java.util.Scanner;
public class MilitaryTimeReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int hours;
		int minutes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first time");
		int time1 = scan.nextInt();
		System.out.println("Enter second time");
		int time2 = scan.nextInt();
		if (time1 > time2){
			int result = 2400 - (time1 - time2);
			hours = result / 100;
			minutes = result % 100;
			if (minutes > 60){
				minutes -= 40;
			}
		} else {
			int result = time2 - time1;
			hours = result / 100;
			minutes = result % 100;
			if (minutes > 60){
				minutes -= 40;
			}
		}
		scan.close();
		
		System.out.println(hours + " hours " + minutes + " minutes.");
	}

}
