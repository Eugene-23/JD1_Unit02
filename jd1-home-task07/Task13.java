package htp.home.task07;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task13 {

	public static void main(String[] args) {

		int n = 6;
		int[][] mas = new int[n][n];

		initializationMas(mas);

		printMas(mas);
		
	}

	public static int[][] initializationMas(int[][] mas) {

		int count;
		int n;

		for (int i = 0; i < mas.length; i++) {
			count = 1;
			n = mas.length;
			for (int j = 0; j < mas[i].length; j++) {
				if (i % 2 == 0) {
					mas[i][j] = count;
					count++;
				} else {
					mas[i][j] = n;
					n--;
				}
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
		System.out.println();
	}	

}
