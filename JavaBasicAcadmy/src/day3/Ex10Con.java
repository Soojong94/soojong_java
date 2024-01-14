package day3;

import java.util.Scanner;

public class Ex10Con {

	public static void main(String[] args) {

		// 사용자로부터 정수를 입력 받아
		// 3의 배수이면서 5의 배수라면
		// "3과 5의 배수입니다" 출력
		// 아니라면, "3과 5의 배수가 아닙니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다");
		}else { 
			System.out.println("3과 5의 배수가 아닙니다");
		}
		
		
		
		
		
	}

}
