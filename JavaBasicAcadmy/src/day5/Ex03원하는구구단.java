package day5;

import java.util.Scanner;

public class Ex03원하는구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("단 입력 :  ");
		int a = sc.nextInt();
		System.out.print("범위 입력 : ");
		int b = sc.nextInt();

		for (int i = 1; i <= b; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
		
		// 단계별로 진행할 수 있도록 정리 먼저 할 것
		
		// 2*9 까지 출력
		// 2단을 입력 받은 단으로 바꾸기
		// 2단을 입력 받은 단으로 바꾸기
		// 입력 받은 범위까지 나오게 바꾸기

	}


}
