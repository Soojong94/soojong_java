package day1;

import java.util.Random;

public class Practice10 {

	public static void main(String[] args) {

		// 8칸 배열 선언 랜덤수로 초기화 가장 큰수와 가장 작은수 출력

		Random ran = new Random();
		int[] arr = new int[8];
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(10) + 1;
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1 + i ; j < arr.length  ; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("가장 큰 값 : " + arr[7]);
		System.out.println();
		System.out.print(" 가장 작은 값 : " + arr[0]);
	}

}
