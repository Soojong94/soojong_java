package day1;

import java.util.Scanner;

public class Bonus6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int N = sc.nextInt();
		int result = PowerN(base, N);
		System.out.println("결과 확인 : " + result);

	}

	public static int PowerN(int base, int N) {
		int result = base;
		for (int i = 1; i < N; i++) {
			base = base * result;
		}
		return base;
	}
}
