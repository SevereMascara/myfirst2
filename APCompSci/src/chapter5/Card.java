package chapter5;

public class Card {
	private char suit;
	private char value;
	private String traje;
	private String valor;
	public Card(){}
	public Card(String note){
		value = note.charAt(0);
		suit = note.charAt(1);
		if (note.length() == 3){
			value = '0';
			suit = note.charAt(2);
		}
	}
	
	public void getDescription(){
		switch(value){
		case'2':
			valor  = "2";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'3':
			valor  = "3";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'4':
			valor  = "4";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'5':
			valor  = "5";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'6':
			valor  = "6";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'7':
			valor  = "7";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'8':
			valor  = "8";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'9':
			valor  = "9";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'0':
			valor  = "10";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'J':
			valor  = "Jack";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'Q':
			valor  = "Queen";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'K':
			valor  = "King";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		case'A':
			valor  = "Ace";
			switch(suit){
			case 'H':
				traje = "Hearts";
				break;
			case 'C':
				traje = "Clubs";
				break;
			case 'S':
				traje = "Spades";
				break;
			case 'D':
				traje = "Diamonds";
			}
			break;
		}
		System.out.println(valor + " of " + traje);
	}
}
