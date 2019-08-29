package htp.home.task05.main;

/*
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */

public class Task04 {

	public static void main(String[] args) {

		int mas[] = new int[] { 3, 4, 5, 8, 9 };

		isIncreasing(mas);

	}

	public static void isIncreasing(int mas[]) {

		boolean b = false;

		for (int i = 0; i < (mas.length - 1); i++) {
			if (mas[i] < mas[i + 1]) {
				b = true;
			} else {
				b = false;
				break;
			}
		}

		if (b == true) {
			System.out.println("последовательность возрастающая");

		} else {
			System.out.println("последовательность не возрастающая");

		}
	}

}
