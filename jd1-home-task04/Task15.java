package htp.home.task04.main;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task15 {

	public static void main(String[] args) {
		
		int[] mas = new int[3];
		int k = 23;
		int n = 8;

		findNum(mas, k, n);

		printMas(mas);

	}

	public static void findNum(int[] mas, int k, int n) {

		int a;
		int b;
		int c;
		int d;

		for (int i = 100; i < 999; i++) {
			a = i % 10;
			b = (i / 10) % 10;
			c = (i / 100) % 10;
			d = a + b + c;

			if ((d == k) && (a <= n) && (b <= n) && (c <= n)) {
				mas[0] = a;
				mas[1] = b;
				mas[2] = c;

			}
		}

	}
	
	public static void printMas(int[] mas) {
		for(int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}
	}

}
