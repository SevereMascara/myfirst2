package chapter3;

public class Car {
	private double fuelEff;
	private double gas;
	
	public Car(){
		fuelEff = 40;
		gas = 0;
	}
	public Car(double petrol){
		fuelEff = petrol;
		gas = 0;
	}
	
	public void drive(int distance){
		gas -= distance/fuelEff;
	}
	public void fillTank(){
		gas = 20;
	}
	
	public double getGas(){return gas;}
	
	public String toString(){return gas + " gallons left in the tank.";}
	
}
