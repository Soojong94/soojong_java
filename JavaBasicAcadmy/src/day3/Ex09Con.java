package day3;

import java.util.Scanner;

public class Ex09Con {

	public static void main(String[] args) {
		
	      // 사용자로부터 정수를 입력 받아
	      // 만약, 짝수라면 -> "짝수입니다" 출력
	      // 홀수라면 -> "홀수입니다" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
	    int num = sc.nextInt();
		
	    if (num % 2 == 0) {
	    	System.out.println("짝수입니다 ");
	    } else {
	    	System.out.println("홀수입니다 ");
	    }
		System.out.println("프로그램이 종료되었습니다");

	}

}
