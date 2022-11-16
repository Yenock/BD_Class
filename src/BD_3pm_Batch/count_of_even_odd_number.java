package BD_3pm_Batch;

public class count_of_even_odd_number {

	public static void main(String[] args) {

		int evencount = 0, oddcount = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evencount++;
			} 
			else {
				oddcount++;
			}
		}
		System.out.println("Even count is: " + evencount);
		System.out.println("Odd count is: " + oddcount);
	}

}
