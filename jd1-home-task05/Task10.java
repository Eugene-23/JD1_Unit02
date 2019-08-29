package htp.home.task05.main;

import java.util.Random;

/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task10 {

	public static void main(String[] args) {
		
		int n = 7;

		int mas[] = new int[n];

		Random rand = new Random();		
		
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);			
			System.out.print(mas[i] + " ");
		}
		System.out.println('\n' + "--------------");		
		
		getAiMoreThanI(mas);
		
	}
	
	public static void getAiMoreThanI(int mas[]) {
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i+1) {
				System.out.print(mas[i] + " ");
			}					
		}
		
	}

}
