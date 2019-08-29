package htp.home.task07;

import java.util.Random;

/*
 * Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
 * строка слева направо, третья строка справа налево и так далее.
 */

public class Task11 {

	public static void main(String[] args) {

		int m = 4;
		int n = 5;
		int[][] mas = new int[m][n];

		initializationMas(mas);

		printMas(mas);

		changeMas(mas);

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

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[][] changeMas(int[][] mas) {

		int temp;

		for (int i = 0; i < mas.length; i++) {
			
			if (i % 2 == 0) {
				for (int j = 0; j < mas[i].length / 2; j++) {
					
					temp = mas[i][j];					
					mas[i][j] = mas[i][mas[i].length - 1 - j];					
					mas[i][mas[i].length - 1 - j] = temp;					
				}
			}			
		}
		return mas;

	}	

}
