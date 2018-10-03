package intro2classes;
import java.util.Random;
public class Die {
	private static int diceInPlay = 0;
	
	private int faces;
	private int value;
	
	public Die(){
		faces = 6;
		diceInPlay++;
	}
	public Die(int caras){
		faces = caras;
		diceInPlay++;
	}
	
	public void roll(){
		Random rand = new Random();
		value = rand.nextInt(faces) + 1;
	}
	
	public int getValue(){return value;}
	public int getFaces(){return faces;}
	public static int getDiceInPlay(){return diceInPlay;}
	
	public int addTwoDie(Die dado){
		return this.getValue() + dado.getValue();
	}
	
	public int addThreeDie(Die dado, Die muerte){
		return this.getValue() + dado.addTwoDie(muerte);
	}
	
	public String toString(){
		return "This is a " + faces + "-faced die with a value of " + value;
	}
	
	

}
