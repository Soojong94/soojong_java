package day04;

public class Ex05For {

	public static void main(String[] args) {

		// for (초기화구문;  조건식; 반복 후 작업 ){
		// 실행문장;
		// }

		for (int i = 1; i <=5 ; i++) {
			System.out.println(i);
		}

	
	
		
		// 21 ~ 57 까지 출력
		
		for (int j = 21; j <=57; j++) {
			System.out.print(j + " ");
		}
	
		System.out.println();
		
		// 22~57 까지 홀수 출력
		
		for (int k = 22 ; k <= 57; k++ ) {
			
			if(k % 2 == 1) {
			
			System.out.print(k + " ");
		}

			
		
		}
		
		System.out.println();
		
		// 1 ~ 100까지 숫자 중 3의 배수를 출력
		
		for (int l = 1 ; l <= 100 ; l++ ) {
			if(l % 3 == 0)
				System.out.print(l + " ");
		
		}
		System.out.println();
		
		// 57부터 21까지 거꾸로 출력
		
		for (int i = 57 ; i >= 21; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		
	for(  int i = 21 ;  i<=57 ; i++) {
		
	}
	}

}
