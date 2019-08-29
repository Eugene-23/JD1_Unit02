package htp.home.task04.main;

import java.util.Random;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task08 {

	public static void main(String[] args) {

		int n = 8;
		getSecondMax(n);

	}

	public static void getSecondMax(int n) {

		int[] mas = new int[n];
		Random rand = new Random();
		
		int Max = 0;
		int second = 0;
		System.out.print("В массиве: ");

		for (int i = 0; i < mas.length; i++) {			
			
			mas[i] = rand.nextInt(10);

			if (mas[i] > Max) {
			    second = Max;
			    Max = mas[i];
			    
			} else if (mas[i] > second) {
			    second = mas[i];
			}
			
			System.out.print(mas[i] + ", ");
		}
		
		System.out.println();
		System.out.println("Второе по величине значение: " + second);

	}

}
