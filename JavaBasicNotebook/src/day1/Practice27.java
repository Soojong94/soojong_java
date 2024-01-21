package day1;

import java.util.Scanner;

public class Practice27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("=====채점하기=====");
		String score = sc.next();
		int count = 0;
		int newCount = 0;
		for (int i = 0; i < score.length(); i++) {
			char[] arr = new char[score.length()];
			arr[i] = score.charAt(i);
			if (arr[i] == 'o') {
				count++;
				newCount += count;
			} else if (arr[i] == 'x') {
				count = 0;
			}
		}
		System.out.println(newCount);
	}

}
