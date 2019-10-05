package htp.home.task07;

/*
 * 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task33 {

	public static void main(String[] args) {

		int temp = 0;
		boolean stored = true;
		int k = 0;

		int[][] mas = new int[5][5];

		Method.init(mas, 999);
		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();

		while (k < mas[0].length) {
			stored = true;
			while (stored) {
				stored = false;
				for (int i = 0; i < mas.length - 1; i++) {
					for (int j = 0; j < mas[i].length; j++) {
						if ((j == k) && (mas[i][j] > mas[i + 1][j])) {
							temp = mas[i][j];
							mas[i][j] = mas[i + 1][j];
							mas[i + 1][j] = temp;
							stored = true;
						}
					}
				}

			}
			k++;
		}

		System.out.println("Матрица с отсортированными строками по возростанию:");
		Method.print(mas);
		System.out.println();
		System.out.println("Матрица с отсортированными строками по убыванию:");

		k = 0;
		while (k < mas[0].length) {
			stored = true;
			while (stored) {
				stored = false;
				for (int i = 0; i < mas.length - 1; i++) {
					for (int j = 0; j < mas[i].length; j++) {
						if ((j == k) && (mas[i][j] < mas[i + 1][j])) {
							temp = mas[i][j];
							mas[i][j] = mas[i + 1][j];
							mas[i + 1][j] = temp;
							stored = true;
						}
					}
				}

			}
			k++;
		}

		Method.print(mas);
		System.out.println();

	}

}
