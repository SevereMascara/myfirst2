package intro2classes;

public class DieTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Die tiffany = new Die();
		Die reynard = new Die(20);
		Die cedrick = new Die();
		
		Die[] board = new Die[3];
		board[0] = tiffany;
		board[1] = reynard;
		board[2] = cedrick;
		
		for (int x =0; x<3; x++){
			board[x].roll();
			System.out.println(board[x]);
		}
		System.out.println(tiffany.getValue() + " + " + reynard.getValue() + " = " + tiffany.addTwoDie(reynard));
		System.out.println(tiffany.getValue() + " + " + reynard.getValue() + " + " + cedrick.getValue() + " = " + tiffany.addThreeDie(cedrick,  reynard));
	}

}
