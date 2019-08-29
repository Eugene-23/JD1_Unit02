package htp.home.task07;

import java.util.Random;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class Task06 {

	public static void main(String[] args) {
		
		int[][] mas = new int[3][4];

		initializationMas(mas);		

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		printMas(mas);		
		
	}

	public static int[][] initializationMas(int[][] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		return mas;

	}

	public static void printMas(int[][] mas) {

		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ( (j % 2 != 0) && (mas[0][j] > (mas[i].length - 1)) ) { 
					System.out.print(mas[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
