package htp.home.task04.main;

/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

public class Task13 {

	public static void main(String[] args) {

		int n = 567498;

		getMassive(n);

	}

	public static int[] getMassive(int n) {

		@SuppressWarnings("unused")
		int r, r1;		
		int masLen = 0;
		int n1 = n;

		System.out.println("число = " + n);
		while (n > 0) {
			r = n % 10;			
			n /= 10;

			masLen++;
		}
		
		int i = masLen-1;
		
		int[] mas = new int[masLen];
		
		System.out.println("элементы массива:");

		while (n1 > 0) {			
			r1 = n1 % 10;
			
			mas[i] = r1;
			System.out.print(mas[i] + ", ");
			
			n1 /= 10;
			i--;			
		}

		return mas;
	}

}
