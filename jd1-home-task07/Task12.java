package htp.home.task07;

/*
 * Получить квадратную матрицу порядка n:
 */

public class Task12 {

	public static void main(String[] args) {
		
		int n = 5;		
		int[][] mas = new int[n][n];
		
		initializationMas(mas);		

		printMas(mas);
		
		
	}

	public static int[][] initializationMas(int[][] mas) {
		
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) { 
					mas[i][j] = count;
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
		System.out.println();
	}	

}
