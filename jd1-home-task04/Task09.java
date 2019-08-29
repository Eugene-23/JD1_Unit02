package htp.home.task04.main;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task09 {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 11;
		int c = 13;
		
		getMutSimple(a, b, c);		

	}

	public static void getMutSimple(int a, int b, int c) {
		
		int nod = 0;
		
		int min = Math.min( Math.min(a,b), c );	    
		
		for (int i = min; i > 0; i--) {
			
			if ((a % i == 0) && (b % i == 0) && (c % i == 0) ) {
				nod = i;
				break;
			}	
						
		}
		
		if (nod == 1) {
			System.out.println("Числа взаимно простые");
			
		} else {
			System.out.println("Числа не взаимно простые, НОД = " + nod);
		}
		

	}

}
