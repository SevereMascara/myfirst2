package chapter3;

public class Bug {
	private boolean right;
	private double location;
	
	public Bug(){
		right = true;
		location = 0;
	}
	
	public Bug(double locacion){
		right = true;
		location = locacion;
	}
	
	public double getLocation(){ return location; }
	
	public void turn(){
		if (right == true){ right = false;}
		
		else { right = true; }
	}
	
	public void move(){
		if (right == true){ location += 1; }
		else { location -=1;}
	}
	
	public void move(double distance){
		if (right == true){ location += distance; }
		else { location -= distance;}
	}
	
	public String toString(){return "its on " + this.location;}
	
}
