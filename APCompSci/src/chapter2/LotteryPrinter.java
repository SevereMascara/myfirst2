package chapter2;
import java.util.Random;
public class LotteryPrinter {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] randos = new int[6];
		for (int x = 0; x<6; x++){
			randos[x] = rand.nextInt(49) + 1;
		}
		System.out.println("Magic!");
		for (int x = 0; x<6; x++){
			System.out.print(randos[x] + " ");
		}

	}

}
