package chapter4;

public class SodaCan {
	private double height;
	private double diameter;

	public SodaCan(){
		height = 0;
		diameter = 0;
	}
	
	public SodaCan(double altitud, double diametro){
		height = altitud;
		diameter = diametro;
	}
	
	public double getHeight(){return height;}
	public double getDiamter(){return diameter;}
	public double getVolume(){
		double radius = diameter/2;
		double circle1 = radius*radius;
		double circle2 = circle1 * Math.PI;
		double volume = circle2 * height;
		return volume;
	}
	
	public double getSurfaceArea(){
		double rect = height * diameter * Math.PI;
		double radius = diameter/2;
		double circle1 = radius*radius;
		double circle2 = circle1 * Math.PI;
		return rect + circle2 + circle2;
	}
	
	public String toString(){
		return "this can has a volume of " + this.getVolume() + " and a surface area of "+ this.getSurfaceArea();
	}
}
