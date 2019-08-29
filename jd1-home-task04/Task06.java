package htp.home.task04.main;

/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 */

public class Task06 {

	public static void main(String[] args) {
		
		int a = 5;
		
		getS(a);

	}
	
	public static void getS(int a) {
		
		double s = 3 * Math.sqrt(3) * Math.pow(a, 2) / 2;

		System.out.println("площадь правильного шестиугольника = " + s);

	}

}
