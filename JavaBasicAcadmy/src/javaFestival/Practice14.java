package javaFestival;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 :");
		int n = sc.nextInt();
		int[][] array = new int[n][n];
		int count = 1;

		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0)
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = count;
					count++;
				}

			else {
				for (int j = array[i].length - 1; j >= 0; j--) {
					array[i][j] = count;
					count++;
				}
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
