package htp.home.task05.main;

/*
 * «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить
 * игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на
 * передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу,
 * которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */

public class Task18 {

	public static void main(String[] args) {
		
		int[] mas = new int[10];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = ((int) (Math.random() * 6) + 1);
			System.out.print(mas[i] + " ");			
		}
		System.out.println();
		boolean b = false;

		for (int i = 1; i < mas.length - 1; i++) {
			int sum = mas[i-1] + mas[i] + mas[i+1];
			if (sum == 10) {				
				b = true;
				System.out.println(mas[i-1] + ", " + mas[i] + ", " + mas[i+1] + " - замок открыт");
			}
		}
		
		if (!b) {
			System.out.println("Комбинаций для открытия замка не найдено");
		}

	}

}
