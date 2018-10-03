package chapter5;

public class Grade {
	private char letter;
	private char symbol;
	private double number;
	public Grade(){}
	
	public Grade(char letro, char simbolo){
		letter = letro;
		symbol = simbolo;
	}
	
	public double getNumGrade(){
		System.out.println(letter);
		switch (letter) {
		case 'A':
			number = 4;
			if (symbol == '-'){number -= .3;}
			break;
		case 'B':
			number = 3;
			if (symbol == '+'){
				number += .3;
			} else if (symbol == '-'){
				number -= .3;
			}
			break;
		case 'C':
			number = 2;
			if (symbol == '+'){
				number += .3;
			} else if (symbol == '-'){
				number -= .3;
			}
			break;
		case 'D':
			number = 1;
			if (symbol == '+'){
				number += .3;
			} else if (symbol == '-'){
				number -= .3;
			}
			break;
		case 'F':
			number = 0;
			break;
		}
		return number;
	}
	
	public static void main(String[]args){
		Grade boo = new Grade('A','-');
		System.out.println(boo.getNumGrade());
	}
}
