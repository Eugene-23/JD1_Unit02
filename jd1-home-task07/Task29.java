package htp.home.task07;

import java.util.Random;

/*
 * 29. Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task29 {

	public static void main(String[] args) {

		int k = 0;

		int[][] mas = new int[5][5];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(200) - 100;
			}
		}

		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();
		System.out.println("Положительные элементы главной диагонали:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((j == k) && (mas[i][j] > 0)) {
					System.out.printf("%4d", mas[i][j]);
				}
			}
			k++;
		}

	}

}
