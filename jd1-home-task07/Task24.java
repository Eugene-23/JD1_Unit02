package htp.home.task07;

/*
 * Дан линейный массив n n x , x , , x , x 1 2 −1  . Получить действительную квадратную матрицу порядка n:
 */

public class Task24 {
		
	static int[] mas1 = new int[]{1, 2, 3, 4, 5, 6};
	
	static int n = mas1.length;
	
	static double[][] mas = new double[n][n];
	
	public static void main(String[] args) {		
		
		initializationMas(mas1, n);

		printMas(mas);		

	}

	public static double[][] initializationMas(int[] mas1, int n) {
		
		int count = 1;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = Math.pow(mas1[j], count);
			}
			count++;
		}
		return mas;

	}
	

	public static void printMas(double[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%.0f", mas[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}

	}

}
