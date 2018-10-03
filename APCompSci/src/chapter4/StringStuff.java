package chapter4;

public class StringStuff {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String quote = "bigly";
		System.out.println(quote.charAt(0));
		
		String quote1 = "bigly";
		System.out.println(quote1.charAt(4));
		
		String quote2 = "bigly";
		quote2 = quote2.substring(1,5);
		System.out.println(quote2);
		
		String quote3 = "bigly";
		quote3 = quote3.substring(0,4);
		System.out.println(quote3);

	}

}
