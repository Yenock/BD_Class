package BD_3pm_Batch;

import java.util.Scanner;

public class swap_twoNumber_usingThirdVariable {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are");
		a = sw.nextInt();
		b = sw.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Swapping numbers are");
		System.out.println(a);
		System.out.println(b);
		
	}

}
