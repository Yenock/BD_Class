package BD_3pm_Batch;

import java.util.Scanner;

public class find_even_odd_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}

}
