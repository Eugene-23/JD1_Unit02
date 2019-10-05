package htp.home.task07;

/*
 * 36. Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой получается
 * как среднее арифметическое соседей соответствующего элемента исходной матрицы. Построить результат
 * сглаживания заданной матрицы
 */

public class Task36 {

	public static void main(String[] args) {
		
		int[][] mas = new int[6][6];

		Method.init(mas, 100);

		Method.print(mas);
		System.out.println();
		

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = arithmeticMeanNum(mas, i, j);
			}
		}
		System.out.println("Результат: ");
		Method.print(mas);
	}

	public static int arithmeticMeanNum(int[][] mas, int i, int j) {
		
		int sumNeighbors = 0;
		int countNeighbors = 0;

		if (i > 0) {
			countNeighbors++;
			sumNeighbors = sumNeighbors + mas[i - 1][j];
		}

		if (j > 0) {
			countNeighbors++;
			sumNeighbors = sumNeighbors + mas[i][j - 1];
		}

		if (i < mas.length - 1) {
			countNeighbors++;
			sumNeighbors = sumNeighbors + mas[i + 1][j];
		}

		if (j < mas[i].length - 1) {
			countNeighbors++;
			sumNeighbors = sumNeighbors + mas[i][j + 1];
		}
		return sumNeighbors / countNeighbors;

	}

}
