package htp.home.task07;

/*
 * 28. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
 * содержит максимальную сумму.
 */

public class Task28 {

	public static void main(String[] args) {

		int sum = 0;
		int k = 0;
		int max = 0;
		int indMax = 0;

		int[][] mas = new int[3][6];

		Method.init(mas, 10);
		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();
		System.out.println("Результат:");

		while (k < mas[0].length) {
			sum = 0;
			for (int i = 0; i < mas.length; i++) {
				for (int j = 0; j < mas[i].length; j++) {
					if (j == k) {
						sum = sum + mas[i][j];
					}
				}
			}

			if (max < sum) {
				max = sum;
				indMax = k;
			}

			System.out.println("Сумма элементов столбца " + k + " равна " + sum);
			k++;

		}
		System.out.println("Максимальная сумма элементов содержится в столбце " + indMax);

	}

}
