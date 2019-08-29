package htp.home.task05.main;

import java.util.Random;

/*
 * Дана последовательность целых чисел a1, a2,...,an. Образовать новую последовательность, выбросив из исходной
 * те члены, которые равны min(a1, a2,...,an).
 */

public class Task17 {
	
	static int count = 0;

	public static void main(String[] args) {

		int n = 10;
		int mas[] = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		
		
		int mas1[] = DeleteMin(mas);
		System.out.println("---------------------------");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}

	}

	public static int[] DeleteMin(int mas[]) {

		int min = mas[0];		

		for (int i = 1; i < mas.length; i++) {

			if (mas[i] < min) {
				min = mas[i];
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == min) {
				count++;				
			}
		}
		System.out.println("Минимальное значение = " + min + ", " + count + "шт");
		
		int mas1len = mas.length - count;
		int mas1[] = new int[mas1len];
		int count1 = 0;
		
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
				mas1[count1] = mas[i];
				count1++;
			}
		}		
		return mas1;

	}

}
