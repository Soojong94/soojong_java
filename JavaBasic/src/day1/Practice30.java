package day1;

import java.util.Scanner;

public class Practice30 {

	public static void main(String[] args) {

//		입력된 문장에 포함된 알파벳의 빈도를 대소문자 구별없이 구하는 프로그램 작성

		Scanner sc = new Scanner(System.in);
		System.out.println("=====알파벳 빈도수 구하기=====");
		System.out.print("입력 >> ");
		String str = sc.nextLine().trim().toLowerCase();
		char[] str2 = str.toCharArray();
		int[] arr = new int[26];
		int count = 0;

		for (int i = 97; i <= 122; i++) {
			arr[i - 97] = i;
			for (int j = 0; j < str2.length; j++) {
				if (arr[i - 97] == str2[j]) {
					count++;
				}

			}
			System.out.printf("%c : %d%n", i, count);
			count = 0;
		}

	}
}
