package javaFestival;

import java.util.Scanner;

public class Practice30 {

	public static void main(String[] args) {

//		알파벳의 빈도를 대소문자 구분없이 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		int[] arr = new int[26];
		char[] str2 = str.toCharArray();
		int count = 0;

		for (int i = 97; i <= 122; i++) {
			arr[i - 97] = i;
			for (int j = 0; j < str2.length; j++) {
				if (arr[i - 97] == str2[j]) {
					count++;
				}
			}
			System.out.printf("%c : %d %n", i, count);
			count = 0;
		}

	}
}
