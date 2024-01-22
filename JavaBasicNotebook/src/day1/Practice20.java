package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();

		while (num >= 1) {
			if (num % 2 == 1) {
				arr.add(1);
			} else {
				arr.add(0);
			}
			num /= 2;
		}
		for (int i = arr.size() - 1; i >= 0; i--) {
			System.out.print(arr.get(i) + " ");
		}
	}
}
