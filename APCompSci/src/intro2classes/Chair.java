package intro2classes;

public class Chair {
	private double height;
	private int numberRips;
	private String name;
	
	public Chair(){ 
		height = 14;
		numberRips = 0;
		name = "Geoffred";
	}
	public Chair(double altura, String nombre){ 
		height = altura; 
		numberRips = 0;
		name = nombre;
	}
	public void sawLegs(){ height = height - 1.1; }
	
	public double getHeight(){ return height; }
	
	public void addLifter() { height += 0.9; }
	
	public void rip() { numberRips += 1; }
	
	public void rip( int ripperonis ) { numberRips += ripperonis; }
	
	public int getRips() { return numberRips; }
	
	public void sew() {numberRips -= 1; }
	
	public String toString() {return name + " " + height;}
	
	

}
