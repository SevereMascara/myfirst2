package chapter4;

public class Triangle {
	private double jx;
	private double jy;
	private double kx;
	private double ky;
	private double lx;
	private double ly;
	private double aLength; // j and k
	private double bLength; // k and l
	private double cLength; // j and l
	private double Avalue; // point l
	private double Bvalue; // point j
	private double Cvalue; // point k
	private double perim;
	private double area;
	
	public Triangle(){
		jx = 0;
		jy = 0;
		kx = 0;
		ky = 0;
		lx = 0; 
		ly = 0;
	}
	
	public Triangle(double qx, double qy, double rx, double ry, double sx, double sy){
		jx = qx;
		jy = qy;
		kx = rx;
		ky = ry;
		lx = sx;
		ly = sy;
		
		aLength = Math.sqrt( ((jx - kx) * (jx - kx)) + ((jy - ky) * (jy - ky)) );
		bLength = Math.sqrt( ((lx - kx) * (lx - kx)) + ((ly - ky) * (ly - ky)) );
		cLength = Math.sqrt( ((jx - lx) * (jx - lx)) + ((jy - ly) * (jy - ly)) );
		
		double a = aLength;
		double b = bLength;
		double c = cLength;
		Avalue = Math.acos( (b*b - a*a + c*c) / (2 * b * c));
		Bvalue = Math.acos( (a*a - b*b + c*c) / (2 * a * c));
		Cvalue = Math.acos( (a*a - c*c + b*b) / (2 * a * b));
		
		Avalue = Avalue * 360 / (2*Math.PI);
		Bvalue = Bvalue * 360 / (2*Math.PI);
		Cvalue = Cvalue * 360 / (2*Math.PI);
		
		perim = a + b + c;
		
		double s = perim / 2;
		area = Math.sqrt(s * (s-a) * (s-b) * (s-c) );
	}
	
	
	public double getALength(){return aLength;}
	public double getBLength(){return bLength;}
	public double getCLength(){return cLength;}
	
	
	public String toString(){
		System.out.println("Side Lengths  | A | " + aLength);
		System.out.println("              | B | " + bLength);
		System.out.println("              | C | " + cLength);
		System.out.println();
		System.out.println("Angle Degrees | A | " + Avalue);
		System.out.println("              | B | " + Bvalue);
		System.out.println("              | C | " + Cvalue);
		System.out.println();
		System.out.println("Perimeter     |._.| " + perim);
		System.out.println("Area          |._.| " + area);
		return "";
	}
	
}
