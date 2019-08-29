package htp.home.task07;

/*
 * Получить квадратную матрицу порядка n:
 */

public class Task25 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		initializationMas(mas, n);

		printMas(mas);

	}

	public static int[][] initializationMas(int[][] mas, int n) {

		int count = 0;
		

		for (int i = 0; i < mas.length; i++) {
			int count2 = 1;
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (n * count) + count2;
				count2++;
			}
			count++;
			
		}
		return mas;

	}

	public static void printMas(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
