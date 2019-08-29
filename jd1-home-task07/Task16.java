package htp.home.task07;

/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task16 {

	public static void main(String[] args) {
		
		int n = 6;
		int[][] mas = new int[n][n];

		initializationMas(mas);

		printMas(mas);
		
	}

	public static int[][] initializationMas(int[][] mas) {

		int count = 1;
		
		for (int i = 0; i < mas.length; i++) {			
			for (int j = 0; j < mas[i].length; j++) {
				
				if (j == count-1) {
					mas[i][j] = count * (count + 1);
					
				} else {
					mas[i][j] = 0;
					
				}
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
