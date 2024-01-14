package day1;

import java.util.Random;

public class Practice10 {

	public static void main(String[] args) {

		int[] array = new int[8];
		Random ran = new Random();
		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			System.out.print(array[i] + " ");

		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					int temp;
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}

		}
		System.out.println();
		System.out.println("가장 작은 값 : " + array[0]);
		System.out.println("가장 큰 값 : " + array[array.length-1]);

	}

}
