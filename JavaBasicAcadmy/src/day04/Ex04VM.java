package day04;

import java.util.Scanner;

public class Ex04VM {

	public static void main(String[] args) {

		// 자판기 만들자
		Scanner sc = new Scanner(System.in);
		System.out.print("투입금액 : ");
		int money = sc.nextInt();
		
		System.out.println("=======메뉴=======");
		System.out.println("[1]쌍화차 [2]Dr.Pepper [3]데자와");
		System.out.println("   2000원   1500원       1000원");
		System.out.print("메뉴를 선택하세요 : ");
		
		int menu = sc.nextInt();
		int change = money;

		if (menu == 1) {
			if (money >= 2000) {
				System.out.println("쌍화차");
				change -= 2000;
			} else {
				System.out.println("금액이 부족합니다");
			}

		} else if (menu == 2) {
			if (money >= 1500) {
				System.out.println("Dr.Pepper");
				change -= 1500;
			} else {
				System.out.println("금액이 부족합니다");
			}
		} else if (menu == 3) {
			if (money >= 1000) {
				System.out.println("데자와");
				change -= 1000;
			} else {
				System.out.println("금액이 부족합니다");
			}
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

		System.out.println("잔돈 : " + change + "원");

		// 만약 잔돈이 8000원 이라면 
		// 천원 : 8장
		
		int count_1000 = change / 1000;
		System.out.println("천원 : " + count_1000 + "장");
		
		int count_500 = change % 1000 / 500 ;
		System.out.println("오백원 : " + count_500 + "개");
		
		int count_100 = change % 500 / 100 ;
		System.out.println("백원 :" + count_100 + "개");
		
	}

}
