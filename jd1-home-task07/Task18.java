package htp.home.task07;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task18 {

	public static void main(String[] args) {
		
		int n = 6;
		int[][] mas = new int[n][n];

		initializationMas(mas, n);

		printMas(mas);
		
	}

	public static int[][] initializationMas(int[][] mas, int n) {

		int count = 1;
		
		for (int i = 0; i < mas.length; i++) {			
			for (int j = 0; j < mas[i].length; j++) {
				
				if (j <= n - 1) {
					mas[i][j] = count;
					
				} else {
					mas[i][j] = 0;
					
				}
			}
			count++;
			n--;
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
