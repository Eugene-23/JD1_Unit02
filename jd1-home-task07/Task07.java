package htp.home.task07;

import java.util.Random;

/*
 * Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.
 */

public class Task07 {

	public static void main(String[] args) {
		
		int[][] mas = new int[5][5];

		initializationMas(mas);		

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		int sum = findSum(mas);		
		
		System.out.println("Sum = " + sum);
		
	}

	public static int[][] initializationMas(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10) - 5;
			}
		}
		return mas;

	}

	public static int findSum(int[][] mas) {
		
		int sum = 0;

		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ( (mas[i][j] < 0) && (mas[i][j] % 2 != 0) ) { 
					sum = sum + Math.abs(mas[i][j]);
				}
			}			
		}		
		return sum;

	}

}
