package day10;

import java.util.Scanner;

public class Ex02getSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int result = getSum(num); // 약수의 합
		System.out.print(num + "의 약수의 합 : " + result);
		System.out.println();
		getDivisor(num); // 약수를 나열

	}

	public static int getSum(int num) {
		int result = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				result += i;
			}
		}
		return result;
	}

	public static void getDivisor(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				// 선생님 코드
				// String result = "";
				// for (int i = 1; i <= num; i++) {
				// if (num % i == 0) {
				// result += i + " ";}
//			}
//		} System.out.println(num + "의 약수 : " + result);
			}
		}
	}

}
