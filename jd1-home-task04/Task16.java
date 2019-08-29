package htp.home.task04.main;

/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). Найти
 * и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения
 * задачи использовать декомпозицию.
 */

public class Task16 {

	static int var1;
	static int var2;
	static boolean b1;
	static boolean b2;

	public static void main(String[] args) {

		int n = 40;		
		findTwins(n);
	}

	public static void findTwins(int n) {

		for (int i = n; i <= (n * 2); i++) {
			b1 = false;
			b2 = false;
			var1 = 2;
			var2 = 2;
			if (checkNaturalNumber1(i) && checkNaturalNumber2(i - 2)) {
				System.out.println("Числа " + i + " и " + (i - 2) + " являются близнецами");
			}
		}
	}

	private static boolean checkNaturalNumber1(int n) {

		if (n % var1 != 0) {
			var1++;
			checkNaturalNumber1(n);

		} else if (n % var1 == 0) {

			if (var1 == n) {
				b1 = true;				
			} 
		}
		return b1;
	}

	private static boolean checkNaturalNumber2(int m) {

		if (m % var2 != 0) {
			var2++;
			checkNaturalNumber2(m);

		} else if (m % var2 == 0) {

			if (var2 == m) {
				b2 = true;				
			}
		}
		return b2;
	}
}
