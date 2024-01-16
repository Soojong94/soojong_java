package day07;

import java.util.Scanner;

public class Ex07채점프로그램 {

	public static void main(String[] args) {

		int[] input = new int[5];

		// 실제 정답 배열
		int[] answer = { 1, 4, 3, 2, 1 };
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("===채점하기=== \n답을 입력하세요");

		for (int i = 0; i < input.length; i++) {

			System.out.print((i + 1) + "번 답>> ");
			input[i] = sc.nextInt();
		}
		System.out.println("정답 확인 ");
		for (int i = 0; i < input.length; i++) {
			if (input[i] == answer[i]) {
				sum += 20;
				System.out.print("O\t");
			} else {
				System.out.print("X\t");
			}

		}

		System.out.println("총점 : " + sum);
	}

}
