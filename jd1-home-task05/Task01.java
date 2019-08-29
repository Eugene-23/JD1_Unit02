package htp.home.task05.main;

/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Task01 {

	public static void main(String[] args) {
		
		int[] a = new int[] {5, 3, 7, 8, 9, 12};		
		int k = 3;
		
		int sum = getSum(a, k);		
		
		System.out.println("сумма = " + sum);			
	}
	
	public static int getSum(int[] a, int k) {
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {			
			if (a[i] % k == 0) {				
				sum = sum + a[i];
			}
		}
		return sum;
		
	}

}
