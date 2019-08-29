package htp.home.task04.main;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Task12 {

	public static void main(String[] args) {
		
		int x = 7;
		int y = 5;
		int z = 6;
		int t = 4;		
		
		System.out.println("площадь четырехугольника = " + getSquare(x, y, z, t));

	}
	
	public static double getSquare(int x, int y, int z, int t) {
		
		double s1 = x * y / 2;
		
		double d = Math.sqrt(x*x + y*y);
		
		double p = (z + t + d) / 2;
		double s2 = Math.sqrt(p*(p - z)*(p - t)*(p - d));
		
		return s1 + s2;
				
	}

}
