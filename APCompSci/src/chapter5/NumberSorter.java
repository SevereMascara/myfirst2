package chapter5;
import java.util.Scanner;
public class NumberSorter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 numbers");
		double[] nums = new double[3];
		nums[0] = scan.nextDouble();
		nums[1] = scan.nextDouble();
		nums[2] = scan.nextDouble();
		
		System.out.println("Sorted:");
		
		double winner = 0;
		
		if (nums[0] > nums[1]){ // doesn't work
			winner = nums[0];
			nums[0] = nums[1];
			nums[1] = winner; 
		}
		
		if (nums[1] > nums[2]){
			winner = nums[1];
			nums[1] = nums[2];
			nums[2] = winner;
		}
		
		if (nums[0] > nums[1] ){
			winner = nums[0];
			nums[0] = nums[1];
			nums[1] = winner;
		}
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		scan.close();

	}

}
