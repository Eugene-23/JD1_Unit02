package htp.home.task05.main;

import java.util.Random;

/*
 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */

public class Task06 {

	public static void main(String[] args) {
		
		int n = 7;
		int mas[] = new int[n];
		
		Random rand = new Random();
				
		for (int i = 0; i < mas.length; i++) {
			mas[i]= rand.nextInt(100);			
		}
		
		int len = getLeastLength(mas);		
		
		System.out.println("наименьшая длина = " + len);		
		
	}
	
	public static int getLeastLength(int mas[]) {
		
		int min = mas[0];
		int max = mas[0];

		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		
		int length = max - min;
		
		return length;
	}

}
