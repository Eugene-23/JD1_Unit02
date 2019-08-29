package htp.home.task05.main;

import java.util.Random;

/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */

public class Task07 {

	public static void main(String[] args) {

		int n = 7;
		int z = 56;

		int mas[] = new int[n];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);
			System.out.print(mas[i] + " ");
		}
		
		replaceMoreThanZ(mas, z);
		
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
	}
	
	public static int[] replaceMoreThanZ(int mas[], int z) {
		
		int count = 0;

		for (int i = 0; i < mas.length; i++) {			
			if (mas[i] > z) {
				mas[i] = z;
				count++;
			}
		}		
		System.out.print('\n' + "количество замен = " + count);
		
		return mas;
	}

}
