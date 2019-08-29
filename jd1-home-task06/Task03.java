package htp.home.task06;

/*
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 <=...<= an. Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент
и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
 */

public class Task03 {

	public static void main(String[] args) {

		int mas[] = new int[] { 1, 2, 3, 4, 5, 7, 9 };

		System.out.println("Массив:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

		mas = changeMas(mas);

		System.out.println('\n' + "Измененный массив:");
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

	}

	public static int[] changeMas(int mas[]) {

		int halfMas = mas.length / 2;
		int temp;

		for (int i = 0; i < halfMas; i++) {

			temp = mas[i];
			mas[i] = mas[mas.length - 1 - i];
			mas[mas.length - 1 - i] = temp;

		}
		return mas;

	}

}
