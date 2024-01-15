package day9;

import java.util.Scanner;

public class Ex08close10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 더 가까운 수 " + result);

	}

	public static int close10(int a, int b) {

		int result = 0;
		int c = Math.abs(a - 10);
		int d = Math.abs(b - 10);

		if (c == d) {
			return 0;
		} else {
			result = (c > d) ? b : a;
		}
		return result;
	}
}


