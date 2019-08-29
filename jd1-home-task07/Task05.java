package htp.home.task07;

import java.util.Random;

/*
 * Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.
 */

public class Task05 {

	public static void main(String[] args) {
		
		int[][] mas = new int[5][4];

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
				if (i % 2 != 0)  {
					System.out.print(mas[i][j] + " ");
				}
			}
			if (i % 2 != 0) {
				System.out.println();
			}
		}

	}

}
