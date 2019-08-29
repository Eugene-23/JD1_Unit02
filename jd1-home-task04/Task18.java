package htp.home.task04.main;

/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */

public class Task18 {

	public static void main(String[] args) {
		
		int n = 3;
	    
	    int a = (int)(Math.pow(10, n - 1));		 //start	    	    
	    int b = (int)(Math.pow(10, n));			 //finish
	    
	    findIncreasingNumbers(a, b);

	}
	
	public static void findIncreasingNumbers(int a, int b) {
		
		int k;
		int temp = 10;
		boolean bool = false;
		int j = 0;				
		
		for (int i = a; i < b; i++) {
			j = i;
			temp = 10;
			
			while (j > 0) {
				k = j % 10;
				j = (j - k) / 10;
				
				if (k < temp) {
					temp = k;
					bool = true;
					
				} else {
					bool = false;
					break;
				}
			}
			
			if (bool == true) {
				System.out.println(i);
			}
		}		
	}
}
