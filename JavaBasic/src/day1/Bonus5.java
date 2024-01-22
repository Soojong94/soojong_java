package day1;

import java.util.Scanner;

public class Bonus5 {

	public static void main(String[] args) {
// 다섯개 정수 입력 받아서 오름차순 정렬 출력

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i - 1] = num;
		}

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}


