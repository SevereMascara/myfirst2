package chapter1;

public class summingRecips {

	public static void main(String[] args) {
		float sum = 0;
		for(float x = 1; x<11; x++) {
			float rx = 1/x;
			sum += rx;
			System.out.println(sum);
		}

	}

}
