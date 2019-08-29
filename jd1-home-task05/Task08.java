package htp.home.task05.main;

import java.util.Random;

/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Task08 {

	public static void main(String[] args) {
		
		int n = 7;
		
		int mas[] = new int[n];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100) - 50;			
			System.out.print(mas[i] + " ");
		}
		
		getCountElements(mas);	

	}
	
	public static void getCountElements(int mas[]) {
		
		int count0 = 0;
		int countneg = 0;
		int countpos = 0;

		for (int i = 0; i < mas.length; i++) {			
			if (mas[i] > 0) {				
				countpos++;
			} else if (mas[i] < 0) {				
				countneg++;
			} else if (mas[i] == 0) {				
				count0++;
			} 			
		}
		
		System.out.println('\n' + "положительных элементов = " + countpos);
		System.out.println("нулевых элементов = " + count0);
		System.out.println("отрицательных элементов = " + countneg);
	}

}
