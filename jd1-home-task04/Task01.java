package htp.home.task04.main;

/*
 * Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 */

public class Task01 {		
	
	public static void main(String[] args) {
		
		int x1 = 5; 
		int y1 = 2; 
		int x2 = 7; 
		int y2 = 4; 
		int x3 = 3; 
		int y3 = 6;
		
		getSquare(x1, y1, x2, y2, x3, y3);		
		
	}	
	
	public static void getSquare(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		double s = (( (x1 - x3)*(y2 - y3) ) - ( (x2 - x3)*(y1 - y3) )) / 2.0;
		
		System.out.println(s);
		
	}

}
