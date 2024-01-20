package javaFestival;

import java.util.Scanner;

public class Bonus3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산(+,-,*,/) : ");
		String op = sc.next();
		System.out.println(cal( num1,  num2,  op));
	}

	public static int cal(int num1, int num2, String op) {
		
		if (op.equals("*")) {
			return  num1 * num2;
		}else if (op.equals("/")) {
			return  num1 / num2;
		}else if (op.equals("+")) {
			return  num1 + num2;
		}else if (op.equals("-")) {
			return  num1 - num2;
		}else {System.out.println("잘못된 입력입니다");
			return 0;
		}
		
	}

}
