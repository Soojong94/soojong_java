package day1;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		
		// 나중에 다시 할 것 ( 기존 코드 참조할 것)

		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		int a = sc.nextInt();
		System.out.println("잔돈 : " + a);
		int sum = a;

		for (int i = sum; i >= 0; i -= sum) {
			if (sum >= 10000) {
				int b = sum / 10000;
				System.out.println("10000원 : " + b + " 개 ");
				sum -= b * 10000;
			} else if (sum >= 5000) {
				int c = sum / 5000;
				System.out.println("5000원 : " + c + " 개 ");
				sum -= c * 5000;
			} else if (sum >= 1000) {
				int d = sum / 1000;
				System.out.println("1000원 : " + d + " 개 ");
				sum -= d * 1000;
			} else if (sum >= 500) {
				int e = sum / 500;
				System.out.println("500원 : " + e + " 개 ");
				sum -= e * 500;
			} else if (sum >= 100) {
				int f = sum / 100;
				System.out.println("100원 : " + f + " 개 ");
				break;
			}

		}
	}
}
