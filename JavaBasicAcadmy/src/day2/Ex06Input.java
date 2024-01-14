package day2;

import java.util.Scanner;

public class Ex06Input {

	public static void main(String[] args) {

//		입력 
//		Java 에서 입력 받는 방법 중 Scanner 사용
//		Scanner -> 레퍼런스 타입
//		기본 데이터 타입
//		키워드 변수명 = 값;(vlaue)
		
//		레퍼런스 데이터 타입
//		타입이름 변수명 -> =  new 타입이름();
		
		
//		콘솔창으로부터 입력 준비 끝
		Scanner sc = new Scanner(System.in);
		
		final int PRICE = 500;
		System.out.print("사려는 붕어빵의 개수 : ");
		int count = sc.nextInt();
		System.out.println(count * PRICE);
		
		
		

		
		
		
		
		
		
		
	}

}
