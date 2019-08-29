package htp.home.task07;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task20 {

	public static void main(String[] args) {
		
		int n = 6;
		int[][] mas = new int[n][n];

		initializationMas(mas, n);

		printMas(mas);

	}

	public static int[][] initializationMas(int[][] mas, int n) {

		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i <= n / 2) {

					if ((j < n - 1) && (j > count)) {
						mas[i][j] = 0;

					} else {
						mas[i][j] = 1;

					}
				} else {
					
					if ((j < n) && (j > count-1)) {
						mas[i][j] = 0;

					} else {
						mas[i][j] = 1;

					}
				}

			}
			if (i <= n / 2) {
				count++;
				n--;
				
			} else {
				count--;
				n++;
			}
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
