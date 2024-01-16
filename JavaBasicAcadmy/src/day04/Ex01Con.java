package day04;

import java.util.Scanner;

public class Ex01Con {

	public static void main(String[] args) {

		// 대입연산자
		// 우항이 먼저 실행!!
		// 복합대입연산자
		// += , -=, *=, /=, %=
		// num += 3 -> num = num + 3;
		// 증감연산자
		// ++피연산자, --피연산자, 피연산자++ , 피연산자--
		// 비교 연산자 : 결과 boolean 타입
		// >, <, >=, <=, ==, !=
		// 논리연산자
		// ! (Not), && (And), ||(Or)
		// !-> ture, false 결과 뒤집는다
		// && -> 둘 다 true 일 때만 true
		// || -> 둘 다 false일 때만 false
		// 조건 연산자 : 조건식의 결과에 따라 실행되는 곳이 다름
		// (조건식) ? (실행문1)-true : (실행문2)-false

		// 조건문
		// 1. 단순 if문
		// if(조건식){
		// 실행문장 ;
		// }
		// 조건식의 결과가 참(true) 이면 실행문장 실행!
		// 거짓(false)이면 그냥 빠져나온다

		// 2. if-else 문
		// 참과 거짓에 따라 실행문장이 달라질 때 사용
		// 조건식의 결과가 참(true)이면 -> if절 실행문장 실행
		// 결과가 거짓(false)이면 -> else절 실행문장 실행

		// 3. else-if 절
		// 3000을 상수값으로 바꿔주시고
		// 만약, 3000원 미만 2000원이상이라면
		// "아메리카노 주문"
		// 2000원 미만이라면
		// "물 마시자"

		final int PRICE_CAFE_MOCHA = 4000;
		final int PRICE_YUZA_TEA = 3000;
		final int PRICE_AMERICANO = 2000;
		Scanner sc = new Scanner(System.in);

		System.out.print("얼마 있어 ? ");
        int money = sc.nextInt();   

		if (money >= PRICE_CAFE_MOCHA) {
			System.out.println("카페모카 주문");
		} else if (money >= PRICE_YUZA_TEA) {
			System.out.println("유자차 주문");
		} else if (money >= PRICE_AMERICANO) {
			System.out.println("아메리카노 주문");
		} else {
			System.out.println("물 마시자");
		}

	}

}
