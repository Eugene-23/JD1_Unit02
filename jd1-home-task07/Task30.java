package htp.home.task07;

/*
 * 30. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
 * которых число 5 встречается три и более раз.
 */

public class Task30 {

	public static void main(String[] args) {
		
		int amount;

		int[][] mas = new int[10][20];

		Method.init(mas, 15);
		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();
		System.out.println("Номера строк, в которых число 5 встречается три и более раз:");

		for (int i = 0; i < mas.length; i++) {
			amount = 0;
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == 5) {
					amount++;
				}
			}

			if (amount >= 3) {
				System.out.printf("%4d", i);
			}
		}

	}

}
