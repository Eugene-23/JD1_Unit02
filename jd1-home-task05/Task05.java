package htp.home.task05.main;

/*
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */

public class Task05 {

	public static void main(String[] args) {

		int mas[] = new int[] { 3, 4, 6, 8, 9 };
		
		int mas1[] = getEvenMas(mas);
		
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + ", ");
		}

	}
	
	public static int[] getEvenMas(int[] mas) {
		
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				count++;
			}
		}

		int mas1[] = new int[count];
		int j = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				mas1[j] = mas[i];
				j++;
			}
		}		
		
		if (count == 0) {
			System.out.println("В последовательности нет четных чисел");
		}
		
		return mas1;
	}

}
