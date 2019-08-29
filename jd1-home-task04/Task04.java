package htp.home.task04.main;

/*
 * Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */

public class Task04 {

	public static void main(String[] args) {

		int a = 8;
		int b = 14;
		int c = 10;

		getNOK(a, b, c);

	}
	
	public static void getNOK(int a, int b, int c) {

		int nok = 0;
		
        if (Math.min(a, Math.min(b, c)) == a) {
        	nok = a;
        	
        } else if (Math.min(a, Math.min(b, c)) == b) {
        	nok = b;
        	
        } else if (Math.min(a, Math.min(b, c)) == c) {
        	nok = c;
        	
        }
        
        while (true) {
        	
            if ((nok % a == 0) && (nok % b == 0) && (nok % c == 0)) {
            	break;
            	
            } else {
            	nok += 1;
            	
            }
        }
        
		System.out.println("НОК = " + nok);

	}

}
