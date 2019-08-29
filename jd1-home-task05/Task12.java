package htp.home.task05.main;

import java.util.Random;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
 * простыми числами.
 */

public class Task12 {

	static int var;
	static boolean b;

	public static void main(String[] args) {

		int n = 11;

		int mas[] = new int[n];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + " ");
		}

		int sum = findSumOfSimpleElements(mas);

		System.out.println("сумма чисел, порядковые номера которых являются простыми числами = " + sum);

	}

	public static int findSumOfSimpleElements(int mas[]) {

		int sum = 0;
		
		System.out.println('\n' + "порядковые номера, которые являются простыми числами:");

		for (int i = 0; i < mas.length; i++) {

			b = false;
			var = 2;
			if ((i+1 != 1) && checkSimpleNumber(i + 1)) {
				sum = sum + mas[i];
				System.out.print((i + 1) + " = ");
				System.out.println(mas[i] + "; ");
			}

		}
		return sum;

	}

	public static boolean checkSimpleNumber(int i) {

		if (i % var != 0) {
			var++;
			checkSimpleNumber(i);

		} else if (i % var == 0) {

			if (var == i) {
				b = true;
			} else {
				b = false;
			}
		}
		return b;
	}

}
