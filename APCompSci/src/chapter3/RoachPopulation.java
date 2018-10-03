package chapter3;

public class RoachPopulation {
	private int population;
	public RoachPopulation(){
		population = 1000;
	}
	public RoachPopulation(int poblacion){
		population = poblacion;
	}
	
	public void breed(){population *= 2;}
	
	public void spray(){population *= 0.9;}
	
	public int getRoaches(){return population;}
	
	public String toString(){return "We got " + population + " roches!";}
}
