package htp.home.task05.main;

import java.util.Random;

/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
 * несколько, то определить наименьшее из них.
 */

public class Task19 {

	public static void main(String[] args) {
		
		int n = 10;
		int mas[] = new int[n];

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(10);
			System.out.print(mas[i] + " ");
		}
		
		int mpn = getMostPopularNumber(mas);
		
		System.out.println();
		System.out.println("наиболее часто встречающееся наименьшее число: " + mpn);

	}
	
	public static int getMostPopularNumber(int[] mas) {
		
        int[] popular = new int[mas.length];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] == mas[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = mas[0];
        int popResult = popular[0];
        
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = mas[i];
            }
            if ((popResult == popular[i]) && (mas[i] < valResult)) {
                valResult = mas[i];
            }
        }
        return valResult;

    }

}
