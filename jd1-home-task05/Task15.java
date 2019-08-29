package htp.home.task05.main;

import java.util.Random;

/*
 * Дана последовательность действительных чисел a1, a2,...,an. Указать те ее элементы, которые принадлежат отрезку
 * [с, d].
 */

public class Task15 {

	public static void main(String[] args) {
		
		int n = 10;
		int c = 23;
		int d = 71;

		int mas[] = new int[n];

		Random rand = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);			
			System.out.print(mas[i] + " ");
		}
		
		findCountElements(mas, c, d);				
		
	}
	
	public static void findCountElements(int mas[], int c, int d) {
				
		System.out.println('\n' + "--------------------------");
		for (int i = 0; i < mas.length; i++) {
			if ((c <= mas[i]) && (mas[i] <= d)) {
				System.out.print(mas[i] + " ");
				
			}					
		}
		
	}

}
