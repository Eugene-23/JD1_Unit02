package htp.home.task05.main;

import java.util.Random;

/*
 * Даны действительные числа a1, a2,...,an. Найти 
 * max(a1+a2n, a2+a2n+1,...,an+an+1).
 */

public class Task16 {

	public static void main(String[] args) {
		
		int n = 10;
		int mas[] = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		int max = getMaxSum(mas);
		
		System.out.println("max sum = " + max);

	}

	public static int getMaxSum(int mas[]) {
		
		int max = mas[0] + mas[1];

		for (int i = 1; i < mas.length - 1; i++) {
			if ((mas[i] + mas[i+1]) > max) {
				max = mas[i] + mas[i+1];				
			}			
		}		
		return max;

	}

}
