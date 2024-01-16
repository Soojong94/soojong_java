package day09;

public class Ex01메소드 {

	public static void main(String[] args) {
		
		System.out.println(5 + 10);
		System.out.println(3 + 4);
		System.out.println(11 + 7);
		System.out.println(8 + 14);
		
		// 메소드 호출
		// 메소드 이름 (매개변수)
		System.out.println(sum (5, 10));
		System.out.println(sum (3, 4));
		System.out.println(sum (11, 7));
		System.out.println(sum (8, 14));	
		System.out.println(sum(5, 4));

	}
	public static int sum( int a , int b) {
		int result = a + b  ;
		return result;
	
	// 메소드 구조
	// 1. 접근 제한자 - public 	
	// 2. static - 저장공간
	// 3. 리턴 타입 (리턴값이 없는 경우 void 키워드 사용)
	// 4. 메소드 이름(매개변수 나열)
	// 5. return 키워드 -> 반환값
	
	
	}
	
	
	
}
