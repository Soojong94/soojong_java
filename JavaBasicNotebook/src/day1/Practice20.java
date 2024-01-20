package day1;

import java.util.Scanner;

public class Practice20 {
//===============================푸는 중 ==========================
	
	
	public static void main(String[] args) {

		// 10진수 정수를 입력 받아 2진수 변환 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >>> ");
		int num1 = sc.nextInt();

//      ex ) 10 > 1010
//          2^3 2^1

//		제곱수 표현
		for (int i = 1; i < 3; i++) {
			num1 = num1 * num1 ;
		}

		System.out.println(num1);

	}
}
