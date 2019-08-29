package htp.home.task05.main;

import java.util.Random;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Task09 {

	public static void main(String[] args) {

		int n = 7;

		int mas[] = new int[n];

		Random rand = new Random();		
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);			
			System.out.print(mas[i] + " ");
		}
		
		replaceMaxWithMin(mas);
		
		System.out.println("-------------------------------------");		
		for (int i = 0; i < mas.length; i++) {					
			System.out.print(mas[i] + " ");
		}

	}
	
	public static int[] replaceMaxWithMin(int mas[]) {
		
		int max = mas[0];
		int maxi = 0;
		int min = mas[0];
		int mini = 0;
		
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				maxi = i;
			}
			if (mas[i] < min) {
				min = mas[i];
				mini = i;
			}			
		}
		System.out.println('\n' + "max = " + max + ", min = " + min);
		
		mas[maxi] = min;
		mas[mini] = max;
		
		return mas;
	}

}
