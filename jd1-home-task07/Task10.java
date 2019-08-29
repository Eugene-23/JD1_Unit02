package htp.home.task07;

import java.util.Random;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task10 {

	public static void main(String[] args) {
		
		int n = 5;		
		int[][] mas = new int[n][n];
		int k = 2;
		int p = 3;

		initializationMas(mas);		

		printMas(mas);
		
		printKP(mas, k, p);		
		
		
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

	public static void printKP(int[][] mas, int k, int p) {
		
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ( (i == k-1) || (j == p-1) ) { 
					System.out.print(mas[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
