package htp.home.task05.main;

/*
 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - положительное или
 * отрицательное.
 */

public class Task03 {

	public static void main(String[] args) {
		
		int[] mas = new int[] {-3, 2, -5, 8, -6};
		
		getFirst(mas);		
		
	}
	
	public static void getFirst(int[] mas) {
		
		if (mas[0] > 0) {
			System.out.println("положительное");
			
		} else { 
			System.out.println("отрицательное");
			
		}
	}

}
