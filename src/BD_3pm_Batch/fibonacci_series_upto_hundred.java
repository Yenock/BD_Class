package BD_3pm_Batch;

public class fibonacci_series_upto_hundred {

		public static void main(String[] args) {
			
			int a = 0, b = 1;
			System.out.println(a);
			System.out.println(b);
			
			for (int i = 1; i <= 10; i++) {
				int c = a + b;
				if (c <=100) 
					a = b;
					b = c;
					System.out.println(c);
			}
			
			
		}

	}

	
	
	

