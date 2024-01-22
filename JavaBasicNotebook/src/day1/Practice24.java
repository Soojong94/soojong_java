package day1;

import java.util.Scanner;

public class Practice24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("X 입력 : ");
		int num2 = sc.nextInt();
		int[] arr = new int[num1];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 정수 입력 : ");
			int num3 = sc.nextInt();
			arr[i] = num3;
		}
		System.out.print("결과 :\t");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < num2) {
				System.out.print(arr[i] + "\t");
			}
		}
	}

}
