package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bonus5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
