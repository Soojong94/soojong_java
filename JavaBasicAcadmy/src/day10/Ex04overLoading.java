package day10;

public class Ex04overLoading {

	public static void main(String[] args) {

		// 메소드 오버로딩
		// 1. 메소드 이름은 동일
		// 2. 메소드 구별 :  매개변수 개수, 매개변수 데이터 타입으로 구별
		
		
		
		add(5,9); //14
		add(1.5 , 6); //7.5
		add(2.3, 5 ,6.9);//12.2
		
		
		
	}
	
	public static int add (int a , int b) {
		return a + b;
	}

	public static double add (double a, int b) {
		return a + b ;
	}
	public static double add(double a, double b , double c) {
		return a + b + c ;
	}
		
}
