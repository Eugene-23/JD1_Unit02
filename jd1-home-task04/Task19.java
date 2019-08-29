package htp.home.task04.main;

/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. Определить
 * также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Task19 {

	public static void main(String[] args) {

		int n = 3;

		int a1 = (int) (Math.pow(10, (n - 1)));
		int a2 = (int) (Math.pow(10, n));

		int m = getSumOdd(a1, a2);
		System.out.println("сумма чисел, содержащих только нечетные цифры = " + m);

		int l = getevenCounter(m);
		System.out.println("количество четных цифр в найденной сумме = " + l);

	}

	public static int getSumOdd(int a1, int a2) {

		int sum = 0;
		int k;
		boolean bool;

		for (int i = a1; i < a2; i++) {
			int j = i;
			bool = false;

			while (j > 0) {

				k = j % 10;

				if (k % 2 != 0) {
					bool = true;

				} else if (k % 2 == 0) {
					bool = false;
					break;

				}
				j = j / 10;
			}
			if (bool == true) {
				sum = sum + i;
			}

		}
		return sum;

	}

	public static int getevenCounter(int m) {

		int count = 0;
		int k;
		
		while (m > 0) {

			k = m % 10;
			
			if (k % 2 == 0) {
				count++;
				
			} 
			m = m / 10;
			
		}
		return count;

	}

}
