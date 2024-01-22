package javaFestival;

import java.util.Random;
import java.util.Scanner;

public class Practice29 {

	public static void main(String[] args) {

//		랜덤 수 2개
//		사용자는 합 입력
//		일치하면 success
//		틀리면 fail
//		문제는 계속 바뀜

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			for (int i = 1; i <= 5; i++) {
				int num1 = ran.nextInt(10) + 1;
				int num2 = ran.nextInt(10) + 1;
				System.out.print(num1 + " + " + num2 + " = ");
				int answer = sc.nextInt();
				if (answer == num1 + num2) {
					System.out.println("success");
					i = 0;
				} else {
					System.out.println("fail");
				}

			}
			System.out.println("game over");
			break;
		}

	}

}
