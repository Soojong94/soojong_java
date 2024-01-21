package day1;

import java.util.Scanner;

public class Practice25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0 을 제외한 숫자를 입력해주세요 : ");
		String num = sc.next();
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			char num1 = num.charAt(i);

			if (num1 == '0' || num1 == '6' || num1 == '9') {
				count += 6;
			} else if (num1 == '1') {
				count += 2;
			} else if (num1 == '2' || num1 == '3' || num1 == '5') {
				count += 5;
			} else if (num1 == '4') {
				count += 4;
			} else if (num1 == '7') {
				count += 3;
			} else if (num1 == '8') {
				count += 7;
			}
		}
		System.out.println(count);
	}
}