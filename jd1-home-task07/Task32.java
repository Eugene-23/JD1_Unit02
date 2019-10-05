package htp.home.task07;

/*
 * 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task32 {

	public static void main(String[] args) {
		
		int temp = 0;
		boolean stored = true;

		int[][] mas = new int[5][5];

		Method.init(mas, 999);
		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			stored = true;
			while (stored) {
				stored = false;
				for (int j = 0; j < mas[i].length - 1; j++) {
					if (mas[i][j] > mas[i][j + 1]) {
						temp = mas[i][j];
						mas[i][j] = mas[i][j + 1];
						mas[i][j + 1] = temp;
						stored = true;
					}
				}
			}
		}
		
		System.out.println("Матрица с отсортированными строками по возростанию:");
		Method.print(mas);
		System.out.println();
		System.out.println("Матрица с отсортированными строками по убыванию:");

		for (int i = 0; i < mas.length; i++) {
			stored = true;
			while (stored) {
				stored = false;
				for (int j = 0; j < mas[i].length - 1; j++) {
					if (mas[i][j] < mas[i][j + 1]) {
						temp = mas[i][j];
						mas[i][j] = mas[i][j + 1];
						mas[i][j + 1] = temp;
						stored = true;
					}
				}
			}
		}
		
		Method.print(mas);
		System.out.println();

	}

}
