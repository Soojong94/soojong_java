package day03;

import java.util.Scanner;

public class Ex06Opr {

	public static void main(String[] args) {

		// 삼항 연산자
		// 6. 조건 연산자
		// (조건식) ? (실행문1) : (실행문2)
		
		boolean isRainy = false;
		
		String result = (isRainy) ? "비가 온다. " : "비가 오지 않는다. ";
		System.out.println(result);
		
		// 10 = 짝수
		// 9 = 홀수
		// 짝수 = 2로 나눴을 때 나머지가 0인 수
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String isEven = (num % 2 == 0) ? ("짝수") : ("홀수");
		System.out.println(isEven);		
		
		
		
		
		
		
		
		
		
		
	}

}
