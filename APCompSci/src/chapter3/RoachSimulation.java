package chapter3;

public class RoachSimulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RoachPopulation calBerkeley = new RoachPopulation(10);
		for (int j = 1; j<4; j++){
			calBerkeley.breed();
			calBerkeley.spray();
			System.out.println(calBerkeley);
		}
	}

}
