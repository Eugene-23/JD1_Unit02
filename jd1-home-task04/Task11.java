package htp.home.task04.main;

import java.util.Random;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Task11 {

	public static void main(String[] args) {
		
		int n = 6;
		int[] mas = new int[n];
		Random rand = new Random();		
		System.out.print("В массиве: ");
		
		for (int i = 0; i < mas.length; i++) {			
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + ", ");
		}
		
		getSum(1, 3, mas);
		getSum(3, 5, mas);
		getSum(4, 6, mas);

	}		

	public static int getSum(int k, int m, int[] mas) {
		
		int sum = 0;

		for (int i = k-1; i <= m-1; i++) {			
			sum += mas[i];
			
		}
		System.out.print('\n' + "Сумма элементов от " + k + " до " + m + " = " + sum);
		
		return sum;
	}

}
