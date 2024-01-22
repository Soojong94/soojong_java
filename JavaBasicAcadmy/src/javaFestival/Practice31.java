package javaFestival;

import java.util.Scanner;

public class Practice31 {

	public static void main(String[] args) {

//		1보다 큰 정수 N을 입력하여 N! 값을 구하시오
//		N의 수보다 작거나 같은 모든 양의 정수의 곱
//		ex)3! = 3*2*1

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int count = 1;

		for (int i = num; i > 0; i--) {
			count *= i;
		}
		System.out.println("출력 : " + count);
	}

}
