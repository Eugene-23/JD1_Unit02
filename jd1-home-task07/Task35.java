package htp.home.task07;

/*
 * 35. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task35 {

	public static void main(String[] args) {

		int max = 0;

		int[][] mas = new int[5][5];

		Method.init(mas, 100);
		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (max < mas[i][j]) {
					max = mas[i][j];
				}
			}
		}

		System.out.println("Максимальный элемент матрицы: " + max);

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] % 2 == 1) {
					mas[i][j] = max;
				}
			}
		}

		System.out.println("Результат:");
		Method.print(mas);

	}

}
