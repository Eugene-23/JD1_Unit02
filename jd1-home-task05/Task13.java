package htp.home.task05.main;

import java.util.Random;

/*
 * Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
 * промежутке от L до N.
 */

public class Task13 {

	public static void main(String[] args) {
		
		int n = 10;
		int l = 2;
		int m = 3;

		int mas[] = new int[n];

		Random rand = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);			
			System.out.print(mas[i] + " ");
		}
		
		int count = findCountElements(mas, l, m, n);	
		System.out.println('\n' + "количество элементов последовательности, кратных числу " + m + " и заключенных в промежутке от "  + l + " до " + n + " = " + count);	
		
	}
	
	public static int findCountElements(int mas[], int l, int m, int n) {
		
		int count = 0;
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if ((mas[i] % m == 0) && ((l-1) <= i) && (i <= (n-1))) {
				System.out.print(mas[i] + " ");
				count++;
			}					
		}
		
		return count;
	}

}
