package htp.home.task07;

import java.util.Random;

/*
 * 34. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class Task34 {

	public static void main(String[] args) {

		int sumOne = 0;
		int j = 0;

		int[][] mas = new int[10][10];

		Random rand = new Random();

		while (j < mas[0].length) {

			while (sumOne != j) {
				sumOne = 0;

				for (int i = 0; i < mas.length; i++) {
					mas[i][j] = rand.nextInt(2);
					sumOne = sumOne + mas[i][j];
				}
			}
			j++;
		}

		System.out.println("Исходная матрица:");
		Method.print(mas);

	}

}
