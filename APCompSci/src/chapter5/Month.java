package chapter5;

public class Month {
	private String name;
	public Month(){name = null;}
	public Month(String nombre){
		name = nombre;
	}
	
	public int getDays(){
		switch(name){
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			return 31;
		case "April":
		case "June":
		case "September":
		case "November":
			return 30;
		case "February":
			return 28;
		default:
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Month jesus = new Month("December");
		System.out.println(jesus.getDays());

	}

}
