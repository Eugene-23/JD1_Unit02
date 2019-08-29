package htp.home.task05.main;

import java.util.Random;

/*
 * Дан одномерный массив A[N]. Найти: max(a2, a4,...,a2k) + min(a1 ,a3 ,...,a2k+1)
 */

public class Task14 {

	public static void main(String[] args) {

		int n = 10;
		int mas[] = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		int maxEven = getMaxEven(mas);
		int minOdd = getMinOdd(mas);
		int sum = maxEven + minOdd;

		System.out.println("сумма = " + sum);

	}

	public static int getMaxEven(int mas[]) {
		
		int max = mas[1];

		for (int i = 3; i < mas.length; i = i+2) {
			if (mas[i] > max) {
				max = mas[i];
			}			
		}
		System.out.println("Максимальное четное значение = " + max);
		return max;

	}

	public static int getMinOdd(int mas[]) {

		int min = mas[0];
		
		for (int i = 2; i < mas.length; i = i+2) {
			
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		System.out.println("Минимальное нечетное значение = " + min);
		return min;

	}

}
