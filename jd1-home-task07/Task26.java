package htp.home.task07;

import java.util.Random;

/*
 * С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом следующие действия:
 * а) вычислить сумму отрицательных элементов в каждой строке;
 * б) определить максимальный элемент в каждой строке;
 * в) переставить местами максимальный и минимальный элементы матрицы.
 */

public class Task26 {

	public static void main(String[] args) {

		int m = 4;
		int n = 5;
		int[][] mas = new int[m][n];

		initializationMas(mas);

		printMas(mas);

		getSumNegativeElements(mas);

		getMaxElements(mas);
		
		rearrangeMasElements(mas);
		
		System.out.println("Массив с переставленными максимальными и минимальными значениями:");
		
		printMas(mas);

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

	public static void printMas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void getSumNegativeElements(int[][] mas) {

		int sum;
		System.out.println("Сумма отрицательных элементов каждой строки:");
		
		for (int i = 0; i < mas.length; i++) {
			sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				
				if (mas[i][j] < 0) {
					sum = sum + mas[i][j];					
				}
				
			}
			System.out.println(i+1 + " = " + sum);

		}

	}
	
	public static void getMaxElements(int[][] mas) {

		int max;
		System.out.println("Максимальный элемент в каждой строке:");
		
		for (int i = 0; i < mas.length; i++) {
			max = mas[i][0];
			for (int j = 0; j < mas[i].length; j++) {
				
				if (mas[i][j] > max) {
					max = mas[i][j];					
				}				
			}
			System.out.println(i+1 + " = " + max);

		}

	}
	
	public static int[][] rearrangeMasElements(int[][] mas) {

		int max = -10;
		int maxi = 0;
		int maxj = 0;
		int min = 10;
		int mini = 0;
		int minj = 0;
		int temp;
		
		
		for (int i = 0; i < mas.length; i++) {
			
			for (int j = 0; j < mas[i].length; j++) {
				
				if (mas[i][j] > max) {
					max = mas[i][j];
					maxi = i;
					maxj = j;
				}	
				
				if (mas[i][j] < min) {
					min = mas[i][j];
					mini = i;
					minj = j;
				}
			}			

		}
		
		temp = mas[maxi][maxj];					
		mas[maxi][maxj] = mas[mini][minj];					
		mas[mini][minj] = temp;
		
		return mas;

	}

}
