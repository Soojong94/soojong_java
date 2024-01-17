package javaFestival;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		System.out.print("8자리 정수 입력 : ");
		int n = sc.nextInt();

		for (int i = 10000000; i >= 1; i /= 10) {
			int a = n / i;
			n = n % i;
			sum += a;
		}
		System.out.println("합은 " + sum + "입니다.");

	}

}
