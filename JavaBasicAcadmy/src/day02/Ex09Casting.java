package day02;

public class Ex09Casting {

	public static void main(String[] args) {

		
		
//		자료 형 변환 (Data Type Casting)
		int weight = 78;
//		78.0 으로 출력하고 싶다
//		정수 타입 ->  실수 타입으로 변환
		
		
//		1) 묵시적 형 변환 (Implicit Type Casting)
		double cvt_weight = weight;
		
		System.out.println(cvt_weight);

		final double PI = 3.141592;
		
		
		// 2) 명시적 형 변환 (Explicit Type Casting)
		// (int) 데이터 손실 감안하고도 정수만 받을 거라는 것을 표현
		final int CVT_PI = (int)PI;				
	    System.out.println(CVT_PI);
	    
	    
		
	}

}
