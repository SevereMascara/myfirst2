package chapter4;

public class QuadEq {
	private double alpha;
	private double bravo;
	private double charlie;
	private double sol1;
	private double sol2;
	
	
	public QuadEq(double a, double b, double c){
		alpha = a;
		bravo = b;
		charlie = c;
		
		double num1 = bravo * -1;
		double num2 = Math.sqrt((bravo*bravo) - 4.0 * alpha * charlie);
		double denom = 2.0*alpha;
		sol1 = (num1 + num2) / denom;
		sol2 = (num1 - num2) / denom;
	}
	
	public boolean isReal(){
		if ((bravo*bravo) - 4.0 * alpha * charlie < 0){
			return false;
		} else {
			return true;
		}
	}
	
	public double getSol1(){return sol1;}
	public double getSol2(){return sol2;}
	
	public String toString(){return sol1 + ", " + sol2;}
	
	
}
