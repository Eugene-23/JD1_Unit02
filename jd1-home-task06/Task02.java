package htp.home.task06;

/*
 * Даны две последовательности a1 <= a2 <=...<= an и b1 <= b2 <=...<= bn. Образовать из них новую последовательность чисел
 * так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task02 {

	public static void main(String[] args) {

		int mas1[] = new int[] { 2, 4, 5, 6 };
		int mas2[] = new int[] { 1, 3, 4, 7 };

		System.out.println("Массив 1:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}

		System.out.println('\n' + "Массив 2:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}

		int mas3[] = combineMas(mas1, mas2);

		System.out.println('\n' + "Новый массив:");
		for (int i = 0; i < mas3.length; i++) {
			System.out.print(mas3[i] + " ");
		}

	}

	public static int[] combineMas(int mas1[], int mas2[]) {

		int mas3len = mas1.length + mas2.length;
		int mas3[] = new int[mas3len];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for (int i = 0; i < (mas3.length); i++) {
			
			if (count1 == mas1.length) {
				while (count3 != mas3len) {
					mas3[count3] = mas2[count2];
					count3++;
					count2++;
				}				
                break;
            }
			
            if (count2 == mas2.length) {
            	while (count3 != mas3len) {
					mas3[count3] = mas1[count2];
					count3++;
					count1++;
				}
                break;
			
            }

			if (mas1[count1] <= mas2[count2]) {
				mas3[count3] = mas1[count1];
				count3++;
				count1++;

			} else if (mas1[count1] > mas2[count2]) {
				mas3[count3] = mas2[count2];
				count3++;
				count2++;

			}
			
		}		
		return mas3;			

	}

}
