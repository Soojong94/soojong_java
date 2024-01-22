package day1;

import java.util.Scanner;

public class Practice28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("2진수 입력 : ");
		String str = sc.next();
		char[] arr = new char[str.length()];
		int count = 0;
		int n = 1;

		for (int i = str.length() - 1; i >= 0; i--) {
			arr[i] = str.charAt(i);
			if (arr[i] == '1') {
				count += n;
			}
			n *= 2;
		}
		System.out.println(count);
	}
}