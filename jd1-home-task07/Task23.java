package htp.home.task07;

/*
 * Сформировать квадратную матрицу порядка N по правилу:
 */

public class Task23 {

	public static void main(String[] args) {

		int n = 6;
		double[][] mas = new double[n][n];

		initializationMas(mas, n);

		printMas(mas);
		
		int count = getCountOfNegativeElements(mas);
		System.out.println("Количество отрицательных элементов = " + count);

	}

	public static double[][] initializationMas(double[][] mas, int n) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = Math.sin((i*i - j*j) / n);
			}
		}
		return mas;

	}
	
	public static int getCountOfNegativeElements(double[][] mas) {
		
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					count++;
				}				 
			}
		}
		return count;

	}

	public static void printMas(double[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%.2f", mas[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}

	}

}
