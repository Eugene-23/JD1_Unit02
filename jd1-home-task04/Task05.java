package htp.home.task04.main;

/*
 * Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
 */

public class Task05 {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 12;
		int c = 14;

		getSumMaxMin(a, b, c);

	}

	public static void getSumMaxMin(int a, int b, int c) {

		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int sum = max + min;

		System.out.println("Сумма Max и Min = " + sum);

	}

}
