package htp.home.task04.main;

/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task14 {

	public static void main(String[] args) {
		
		int n1 = 567498;
		int n2 = 616781171;

		getCountNumbers(n1, n2);
		

	}

	public static void getCountNumbers(int n1, int n2) {
			
		int count1 = 0;
		int count2 = 0;
				
		while (n1 > 0) {						
			n1 /= 10;

			count1 ++;
		}
		
		while (n2 > 0) {			
			n2 /= 10;

			count2 ++;			
		}
		
		if (count1 > count2) {
			System.out.println("В числе 1 цифр больше");
			
		} else if (count2 > count1) {
			System.out.println("В числе 2 цифр больше");
			
		} else if (count1 == count2) {
			System.out.println("количество цифр в данныйх числах равно");
			
		}

	}

}
