package BD_3pm_Batch;

import java.util.Scanner;

public class reverse_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	
		int n = sc.nextInt();
		int a, i = 0, j = 0;
		a = n;
		while (a > 0) {
			i = a % 10;
			j = (j * 10);
			a = a / 10;
			
		}
		System.out.println("The reverse number is:" + j);
	}
}
