package javaFestival;

import java.util.Scanner;

public class Bonus2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		getMiddle(word);

	}

	public static String getMiddle(String word) {

		String[] word2 = word.split("");
		int a = word2.length;
		int b = a/2;
		if (a % 2 == 0) {
			System.out.print(word2[b-1]  + word2[b]);
		} else {
			System.out.print(word2[b]);
		}
		return "";
	}

}
