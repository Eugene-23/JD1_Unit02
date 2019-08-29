package htp.home.task04.main;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 */

public class Task02 {

	public static void main(String[] args) {

		int a = 8;
		int b = 12;

		getNOD(a, b);
		
		getNOK(a, b);

	}

	public static void getNOD(int a, int b) {
		
		int nod = 0;

		int min = Math.min(a,b);		
		
		for (int i = min; i > 0; i--) {
			
			if ((a % i == 0) && (b % i == 0)) {
				nod = i;
				break;
			}	
						
		}
		
		System.out.println("НОД = " + nod);

	}
	
	public static void getNOK(int a, int b) {

		int nok;
		
        if (a < b) {
        	nok = a;
        	
        } else {
        	nok = b;
        	
        }        
        while (true) {
        	
            if ((nok % a == 0) && (nok % b == 0)) {
            	break;
            	
            } else {
            	nok += 1;
            	
            }
        }
        
		System.out.println("НОК = " + nok);

	}

}
