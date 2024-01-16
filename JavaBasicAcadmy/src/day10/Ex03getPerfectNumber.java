package day10;

import java.util.Scanner;

public class Ex03getPerfectNumber {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;

		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int num1, int num2) {
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sum += j;
			}
			if (sum == i)
			System.out.print(i + " ");
			sum = 0;// 약수의 총합 리셋
		}

	}

}
