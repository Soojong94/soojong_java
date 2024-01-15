package day9;

import java.util.Scanner;

public class Ex06계산기2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            System.out.print("두번째 정수 입력 : ");
            if (sc.hasNextInt()) {
                int num2 = sc.nextInt();
                System.out.print("연산자 입력 (+, -, *, /) : ");
                String op = sc.next();

                if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
                    System.out.println("잘못된 입력 값입니다");
                } else {
                    System.out.print(cal(num1, num2, op));
                }
            } else {
                System.out.println("두번째 입력값이 정수가 아닙니다");
            }
        } else {
            System.out.println("첫번째 입력값이 정수가 아닙니다");
        }
    }

	public static int cal(int num1, int num2, String op)
	// 메소드 안에 int , string 둘다 입력 가능한 걸 기억할 것//
	{
		int result = 0;
		if (op.equals("+")) {
			result = num1 + num2;
		} else if (op.equals("-")) {
			result = num1 - num2;
		} else if (op.equals("*")) {
			result = num1 * num2;
		} else if (op.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}

}
