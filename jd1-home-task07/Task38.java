package htp.home.task07;

/*
 * 38. Найдите сумму двух матриц
 */

public class Task38 {

	public static void main(String[] args) {
		
		int n = 8;
		int m = 5;

		int[][] mas1 = new int[n][m];
		int[][] mas2 = new int[n][m];

		Method.init(mas1, 100);
		Method.init(mas2, 100);

		Method.print(mas1);
		System.out.println();
		Method.print(mas2);
		System.out.println();
		

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mas1[i][j] = mas1[i][j] + mas2[i][j];
			}
		}
		System.out.println("Результат: ");
		Method.print(mas1);

	}

}
