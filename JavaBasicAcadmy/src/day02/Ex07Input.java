package day02;

import java.util.Scanner;

public class Ex07Input {

	public static void main(String[] args) {
	
		
	      // 붕어빵 가게에 팥붕과 슈붕을 판매한다
	      // 팥붕은 1500원이고 슈붕은 1000원이다
	      // 사용자로부터 팥붕 개수와
	      // 슈붕 개수를 입력 받아
	      // 총액을 계산하시오
		
	      // 문제 정의
	      // 1. 팥붕 가격을 상수 PRICE_RED 에 저장
	      // 2. 슈붕 가격을 상수 PRICE_SHOO 에 저장
	      // 3. 입력 받기 위한 도구 Scanner 사용 준비
	      // 4. 출력 문구 : "사려는 팥붕 개수 : "
	      // 5. 입력 받은 값을 count_red에 저장
	      // 6. 출력 문구 : "사려는 슈붕 개수 : "
	      // 7. 입력 받은 값을 count_shoo 에 저장
	      // 8. PRICE_RED와 count_red를 곱하고
	      // PRICE_SHOO와 count_shoo를 곱해서
	      // 더한 값을 콘솔창에 출력
		
		Scanner sc = new Scanner(System.in);
		
		final int PRICE_RED  = 1500;
		final int PRICE_SHOO = 1000;
		
		System.out.print("사려는 팥붕 개수 : ");
		int count_red = sc.nextInt();
		System.out.print("사려는 슈붕 개수 : ");
		int count_shoo = sc.nextInt();		
		System.out.print(" 총액 : ");
		System.out.println(PRICE_RED * count_red + PRICE_SHOO * count_shoo + " 원");
		
		
		
	}

}
