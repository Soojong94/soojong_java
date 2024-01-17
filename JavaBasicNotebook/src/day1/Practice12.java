package day1;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int cnt = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[j][i] = cnt;
				cnt++;
			}
		}
		for (int[] i : array) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

}
