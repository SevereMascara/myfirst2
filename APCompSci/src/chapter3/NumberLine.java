package chapter3;

public class NumberLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bug jimmy = new Bug(5);
		jimmy.move(15);
		jimmy.turn();
		jimmy.move(10);
		System.out.println(jimmy);
	}

}
