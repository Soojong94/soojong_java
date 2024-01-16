package day06;

import java.util.Scanner;

public class Ex07숫자놀이 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int sum = 0;
		int count = 0;

		do {

			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num <= 100) {
				count++;
				sum += num;
			}

		} while (num <= 100);

		Double avg = (double) sum /  count;
		System.out.print("합계 : " + sum);
		System.out.println();
		System.out.print("평균 : " + avg);

	}

}
