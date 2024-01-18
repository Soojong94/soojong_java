package javaFestival;

import java.util.Random;

public class Practice18 {

	public static void main(String[] args) {

//		중복 없이 45개 숫자 뽑는 로또 프로그램 만들기

		Random ran = new Random();
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("행운의 숫자 : ");
			int num = ran.nextInt(10) + 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == num) {
					num = ran.nextInt(10) + 1;
				}
			}

		}

	}

}
