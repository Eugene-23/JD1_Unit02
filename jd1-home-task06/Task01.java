package htp.home.task06;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

public class Task01 {

	public static void main(String[] args) {
		
		int mas1[] = new int[] {5, 4, 8, 3, 9, 7, 2};
		int mas2[] = new int[] {1, 6, 2, 0, 5, 3};
		int k = 4;
		
		System.out.println("Массив 1:");
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		
		System.out.println('\n' + "Массив 2:");
		for (int i = 0; i < mas2.length; i++) {
			System.out.print(mas2[i] + " ");
		}
		System.out.println('\n' + "k = " + k);

		int mas3[] = combineMas(mas1, mas2, k);
		
		System.out.println("Новый массив:");
		for (int i = 0; i < mas3.length; i++) {
			System.out.print(mas3[i] + " ");
		}

	}

	public static int[] combineMas(int mas1[], int mas2[], int k) {

		int mas3len = mas1.length + mas2.length;
		int mas3[] = new int[mas3len];
		int count3 = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < mas3.length; i++) {
			if (count3 <= (k - 1)) {
				mas3[count3] = mas1[count1];
				count3++;
				count1++;
			}
			
			if (((k - 1) < count3) && (count3 <= ((k-1) + mas2.length))) {
				mas3[count3] = mas2[count2];
				count3++;
				count2++;
			}
			
			if ((count3 > ((k-1) + mas2.length)) && (count3 < mas3.length)) {
				mas3[count3] = mas1[count1];
				count3++;
				count1++;
			}

		}		
		return mas3;

	}

}
