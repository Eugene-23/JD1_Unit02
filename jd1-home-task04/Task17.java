package htp.home.task04.main;

/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная
 * в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи использовать
 * декомпозицию.
 */

public class Task17 {

	public static void main(String[] args) {
		
		int k = 1567;
		
		findArmstrong(k);

	}
	
	public static void findArmstrong(int k) {
		
		System.out.println("Числа Армстронга:");
		
		for (int i = 1; i <= k; i++) {
			int j = i;
			int l = i;
			int n = 0;
			int sum = 0;			
			int m;
			
			while (j > 0) {				
				n++;
				j = j / 10;				
			}
			
			while (l > 0) {
				m = l % 10;								
				sum = sum + (int)(Math.pow(m, n));
				l = l / 10;				
			}
						
			if (sum == i) {
				System.out.println(i);
			}
			
		}		
		
	}

}
