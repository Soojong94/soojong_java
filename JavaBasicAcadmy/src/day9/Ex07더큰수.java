package day9;

import java.util.Scanner;

public class Ex07더큰수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		if (sc.hasNextInt()) {
			int num1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			if (sc.hasNextInt()) {
				int num2 = sc.nextInt();
				int result = largerNumbers(num1, num2);
				System.out.println("더 큰 수 : " + result);
			} else {
				System.out.println("두번째 입력값이 정수가 아닙니다");
			}
		} else {
			System.out.println("첫번째 입력값이 정수가 아닙니다");
		}
	}

	public static int largerNumbers(int a, int b) {
		int result = 0;
		if  (a == b) {
			result = 0;
		} else { result = ( (a > b) ? a :  b );}
		return result;
	}

}
