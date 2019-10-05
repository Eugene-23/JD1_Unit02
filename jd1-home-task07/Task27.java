package htp.home.task07;

import java.util.Scanner;

public class Task27 {

/*
 * 27. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
 * соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.	
 */
	
	public static void main(String[] args) {
		
		int[][] mas = new int[10][10];
		
		int n = 0;
		int m = 0;

		Method.init(mas, 50);
		System.out.println("Первоначальный массив:");
		Method.print(mas);

		System.out.println('\n' + "Введите номера столбцов, которые хотите поменять от 0 до 9 через пробел");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();		
		sc.close();
		
		changeColumn(mas, n, m);
	}

	public static void changeColumn(int[][] mas, int n, int m) {
		int temp = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == n) {
					temp = mas[i][n];
					mas[i][n] = mas[i][m];
					mas[i][m] = temp;
				}
			}
		}
		Method.print(mas);

	}

}
