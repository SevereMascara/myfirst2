package intro2classes;
import java.util.Scanner;
public class FishTester {
// do the random chomp as well
	public static void main(String[] args) {
		/*
		Fish cynthia = new Fish(25,5);
		System.out.println(cynthia.getWeight() );
		System.out.println(cynthia.getScales() );
		cynthia.chomp();
		System.out.println("she got chomped");
		System.out.println(cynthia.getWeight() );
		System.out.println(cynthia.getScales() );
		*/
		Scanner scan = new Scanner(System.in);
		String nam = scan.next();
		double pesado = scan.nextDouble();
		int escales = scan.nextInt();
		Fish Ampi = new Fish(escales, pesado, nam);
		Ampi.chomp();
		System.out.println(Ampi);
		scan.close();
	}

}
