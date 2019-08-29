package htp.home.task04.main;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task03 {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 12;
		int c = 14;
		int d = 10;

		getNOD(a, b, c, d);		

	}

	public static void getNOD(int a, int b, int c, int d) {
		
		int nod = 0;
		
		int min = Math.min( Math.min(a,b), Math.min(c,d) );	    
		
		for (int i = min; i > 0; i--) {
			
			if ((a % i == 0) && (b % i == 0) && (c % i == 0) && (d % i == 0)) {
				nod = i;
				break;
			}	
						
		}
		
		System.out.println("НОД = " + nod);				

	}	

}
