package htp.home.task07;

import java.util.Random;

/*
 * 37. Переставить строки матрицы случайным образом.
 */

public class Task37 {

	public static void main(String[] args) {

		int n = 7;
		int m = 5;

		int temp = 0;

		int[][] mas = new int[n][m];

		Method.init(mas, 100);
		Method.print(mas);

		System.out.println();
		System.out.println("Результат: ");

		Random rand = new Random();
		int randomString = 0;

		for (int i = 0; i < mas.length; i++) {
			randomString = rand.nextInt(mas.length);

			for (int j = 0; j < mas[i].length; j++) {
				temp = mas[i][j];
				mas[i][j] = mas[randomString][j];
				mas[randomString][j] = temp;
			}
		}
		Method.print(mas);

	}

}
