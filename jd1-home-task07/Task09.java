package htp.home.task07;

import java.util.Random;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task09 {

	public static void main(String[] args) {
		
		int n = 5;		
		int[][] mas = new int[n][n];

		initializationMas(mas);		

		printMas(mas);
		
		printDiagonal(mas);		
		
		
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

	public static void printDiagonal(int[][] mas) {
		
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ( (i == j) || (i == mas.length - 1 - j) ) { 
					System.out.print(mas[i][j] + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
		
	}

}
