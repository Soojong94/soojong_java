package day1;

import java.util.Random;

public class Practice18 {

	public static void main(String[] args) {

		// 중복 없이 숫자 뽑는 로또 프로그램(45)

		Random ran = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < 6; i++) {
			int num = ran.nextInt(6) + 1;
			for (int j = 0; j <  i; j++) {
				if (num == arr[j]) {
					num = ran.nextInt(6) + 1;
					j = -1;
				}
			}
			arr[i] = num;
		}

		for (int i : arr) {
			System.out.println("행운의 숫자 : " + i);
		}
	}

}
