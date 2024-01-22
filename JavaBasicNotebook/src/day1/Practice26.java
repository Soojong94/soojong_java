package day1;

import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		int origin = num1;
		int[] arr1 = new int[3];
		for (int i = arr1.length - 1; i >= 0; i--) {
			arr1[i] = num1 % 10;
			num1 /= 10;
		}
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		int[] arr2 = new int[3];
		int origin2 = num2;
		for (int i = arr2.length - 1; i >= 0; i--) {
			arr2[i] = num2 % 10;
			num2 /= 10;
		}

		for (int j = arr2.length - 1; j >= 0; j--) {
			System.out.println(origin * arr2[j]);
		}
		System.out.println(origin * origin2);
	}
}
