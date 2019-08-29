package htp.home.task05.main;

import java.util.Random;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Task20 {

	public static void main(String[] args) {

		int n = 10;
		int mas[] = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + " ");
		}
		System.out.println();

		int mas1[] = DeleteEven(mas);
		
		System.out.println("-------------------");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}

	}

	public static int[] DeleteEven(int mas[]) {

		int mas1len = mas.length;
		int mas1[] = new int[mas1len];
		int count = 0;

		for (int i = 0; i < mas.length; i = i + 2) {
			mas1[count] = mas[i];
			count++;

		}
		return mas1;

	}

}
