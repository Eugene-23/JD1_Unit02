package htp.home.task07;

/*
 * 31. Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.
 */

public class Task31 {

	public static void main(String[] args) {
		
		int amount = 0;

		int[][] mas = new int[10][10];

		Method.init(mas, 999);
		System.out.println("Исходная матрица:");
		Method.print(mas);
		System.out.println();
		System.out.println("Номера строк, в которых число 5 встречается три и более раз:");

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if ((mas[i][j] > 9) && (mas[i][j] < 100)) {
					amount++;
				}
			}
		}
		System.out.println("Количество двузначных чисел в матрице: " + amount);

	}

}
