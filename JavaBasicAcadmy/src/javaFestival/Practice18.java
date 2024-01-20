package javaFestival;

import java.util.Random;

public class Practice18 {

	public static void main(String[] args) {

//		중복 없이 45개 숫자 뽑는 로또 프로그램 만들기

		Random ran = new Random();
		int[] arr = new int[6];
		int num1 = 0;

		for (int i = 0; i < arr.length; i++) {
			num1 = ran.nextInt(6) + 1;
			// 앞에 뽑은 숫자와 비교해서 중복이 없으면 넣기

			for (int j = i - 1; j >= 0; j--) {
				if (num1 == arr[j]) {
					num1 = ran.nextInt(6) + 1;
					j = i;
				}
			}

			arr[i] = num1;

		}

		for (int i : arr) {
			System.out.println("행운의 숫자 : " + i);
		}
	}
}
