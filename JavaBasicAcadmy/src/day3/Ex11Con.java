package day3;

import java.util.Scanner;

public class Ex11Con {

	public static void main(String[] args) {

		// 과일 세트의 가격은 10,000원
		// 사용자로부터 사려는 세트 개수를 입력 받아 
		// 총 금액을 계산하는 프로그램을 만들어주세요
		// 단, 10개 이상 구매시 10% 할인
		// 5개 -> 50,000 원
		// 8개 -> 80,000 원
		// 12개 -> 120,000 원 -> 100,800 원
		
		// Refactoring : 코드의 결과는 동일하지만 가독성을 높이거나 효율을 높이는 작업
		
		Scanner sc = new Scanner(System.in);
		
		final int Fruit_Set = 10000;
		int price;
		double discount = 10 / (double) 100 ;

		System.out.print("구매하려는 과일 세트의 개수 : ");
		int count  = sc.nextInt();
		System.out.print("가격 : ");
		if ( count >= 11 ) {
			price = (int)(count * Fruit_Set * (1 - discount));
			
		} else 
		{price = count * Fruit_Set;}
		
		System.out.println(price + "원");
	}
	


}
