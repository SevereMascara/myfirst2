package chapter3;

public class Student {
	private String name;
	private double testsTaken;
	private double totalScore;
	private double average;
	
	public Student(){
		name = " ";
		testsTaken = 0;
		totalScore = 0;
	}
	
	public Student(String nombre){
		name = nombre;
		testsTaken = 0;
		totalScore = 0;
	}
	
	public String getName(){return name;}
	
	public void addQuiz(double score){
		testsTaken ++;
		totalScore += score;
	}
	
	public double getAverage(){return totalScore / testsTaken;}
	public double getTestsTaken(){return testsTaken;}
	
	public String toString(){
		average = totalScore / testsTaken;
		return name + " has taken " + testsTaken + " tests with an average of " + average;
	}
}
