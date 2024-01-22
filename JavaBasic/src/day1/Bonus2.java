package day1;

import java.util.Scanner;

public class Bonus2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(getMiddle(str));
	}

	public static String getMiddle(String word) {

		String[] word2 = word.split("");
		int a = word2.length;
		int b = a / 2;
		if (a % 2 == 0) {
			return word2[b - 1] + word2[b];
		} else {
			return word2[b];
		}

	}

}
