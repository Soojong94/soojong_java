package day4;

public class Ex06For {

	public static void main(String[] args) {

		// 구구단 2단을 출력
		// printf : print format
		// 정수 : %d (decimal)
		// 엔터 (개행) : %n (new)
		// 실수 : %f (floating)
		// 문자열 : %s (String)
		
		// 안녕하세요 저는 김수종입니다. 나이는 21살 입니다.
		String name = "김수종";
	    int age = 21;
		
	    System.out.printf("안녕하세요 저는 %s입니다. 나이는 %d살 입니다.%n" , name , age);
	    
	    System.out.printf("오늘 비가 올 확률은 %.2f 입니다. %n" , 30.5);
	    
		for (int i = 1; i <= 9; i++) {
			System.out.printf("2 x %d = %d%n", i, 2 * i);
		}
//
//		System.out.printf("2 x %d = %d%n", 1, 2 * 1);
//		System.out.printf("2 x %d = %d%n", 2, 2 * 2);
//		System.out.printf("2 x %d = %d%n", 3, 2 * 3);
//		// ...
//		System.out.printf("2 x %d = %d%n", 9, 2 * 9);

		

		
	}

}
