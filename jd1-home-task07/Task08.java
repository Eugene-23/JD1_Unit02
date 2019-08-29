package htp.home.task07;

import java.util.Random;

/*
 * Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
 * массива.
 */

public class Task08 {

	public static void main(String[] args) {
		
		int n = 4;
		int m = 5;
		int[][] mas = new int[n][m];

		initializationMas(mas);		

		printMas(mas);
		
		int count = findCount(mas);		
		
		System.out.println("Количество элементов равных 7 = " + count);
		
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

	public static int findCount(int[][] mas) {
		
		int count = 0;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 7) { 
					count++;
				}
			}			
		}		
		return count;

	}

}
