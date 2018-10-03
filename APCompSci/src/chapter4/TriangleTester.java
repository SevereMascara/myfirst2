package chapter4;

public class TriangleTester {
	
	public static void main(String[] args) {
		Triangle pythag = new Triangle(0,0,4,0,4,3);
		System.out.println(pythag);
		
		Triangle rightIsoc = new Triangle(0,0,5,0,0,5);
		System.out.println(rightIsoc);
		
		double root = 3 * Math.sqrt(3);
		Triangle equi = new Triangle(0,0,6,0,3,root);
		System.out.println(equi);
		
		double x= 4.76;
		double y = Math.round(x);
		System.out.println(y);
		
	}

}
