package htp.home.task05.main;

/*
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */

public class Task02 {

	public static void main(String[] args) {
		
		int k = 405704090;
		
		int mas[] = NullNumbers(k);
		
		for(int i = 0; i < mas.length; i++) {
			System.out.print(mas[i]);
		}
		
	}
	
	public static int[] NullNumbers(int k) {
		
		int i = k;		
		int count = 0;
		int count1 = 0;
		int m, n;
		
		while(i > 0) {	
			m = i % 10;
			if (m == 0) {
				count++;
			}			
			i = i / 10;
			count1++;
		}
		
		int mas[] = new int[count];
		
		count--;
		count1--;		
		
		int j = k;
		while(j > 0) {
			n = j % 10;
			if (n == 0) {
				mas[count] = count1;
				count--;
			}			
			j = j / 10;
			count1--;
		}
		
		return mas;
	}

}
