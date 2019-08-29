package htp.home.task04.main;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Task20 {

	public static void main(String[] args) {

		int a = 132;
		
		System.out.println("количество вычитаний - " + getCount(a));		

	}
	
	public static int getCount(int a) {
		
		int count = 0;

		while (a > 0) {
			int a1 = a;
			int sum = 0;

			sum = sum + (a1 % 10);
			a1 = a1 / 10;

			while (a1 > 0) {

				sum = sum + (a1 % 10);
				a1 = a1 / 10;				
			}
			
			a = a - sum;
			count++;
			
		}				
		return count;
	}

}
