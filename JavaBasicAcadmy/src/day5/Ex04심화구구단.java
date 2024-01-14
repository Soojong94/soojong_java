package day5;

public class Ex04심화구구단 {

	public static void main(String[] args) {
//2단 출력
//9단까지 출력
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
//		for ( int dan = 2;  dan<= 9; dan++) 

	}

}
