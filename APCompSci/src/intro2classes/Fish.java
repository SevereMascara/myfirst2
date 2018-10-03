package intro2classes;
import java.util.Random;
public class Fish {
	private int numberScales;
	private double weight;
	private String name;
	
	public Fish() {
		numberScales = 40;
		weight = 10;
		name = "Pallavi";
	}
	public Fish(int scls, double wat, String nombre){
		numberScales = scls;
		weight = wat;
		name = nombre;
	}
	public int getScales(){ return numberScales; }
	
	public void setScales(int scalez) { numberScales = scalez; }
	
	public void chomp() { 
		Random rand = new Random();
		numberScales -= rand.nextInt(10);
		double wait = rand.nextInt(3);
		wait = wait/2;
		weight -= wait;
		if (weight <= 0) {
			weight = 0;
			System.out.println("Your fish is gone");
		}
		if (numberScales <= 0){
			numberScales = 0;
			System.out.println("Your fish is naked");
		}
	}
	
	public double getWeight() { return weight; }
	
	public void strip() { 
		Random randy = new Random();
		numberScales -= randy.nextInt(15); 
		if (numberScales <= 0){
			numberScales = 0;
			System.out.println("Your fish is naked");
		}
	}
	
	public String toString() { 
		return name +" weighs " + weight + " and has " + numberScales + " scales!";
	}
}
