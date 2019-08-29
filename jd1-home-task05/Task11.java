package htp.home.task05.main;

import java.util.Random;

/*
 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */

public class Task11 {

	public static void main(String[] args) {
		
		int n = 10;
		int l = 3;
		int m = 7;

		int mas[] = new int[n];

		Random rand = new Random();		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(100);			
			System.out.print(mas[i] + " ");
		}
		System.out.println('\n' + "элементы, у которых остаток от деления на " + m + " равен " + l + ":");		
				
		findElements(mas, l, m);		

	}
	
	public static void findElements(int mas[], int l, int m) {
		
		int count = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % m == l) {
				System.out.print(mas[i] + " ");
				count++;
			}					
		}
		if (count == 0) {
			System.out.println("нет таких элементов");
		}
		
	}

}
