package htp.home.task04.main;

/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Task10 {

	public static void main(String[] args) {

		int n = 9;
		System.out.println("сумма факториалов всех нечетных чисел от 1 до 9 = " + calculateFactorial(n));

	}

	public static int calculateFactorial(int n) {

		int sumFact = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {
				int res = 1;
				
				for (int j = 1; j <= i; j++) {
					res = res * j;

				}
				sumFact += res;
			}
		}
		
		return sumFact;

	}

}
