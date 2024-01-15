package day9;

import java.util.Scanner;

public class Ex09PowerN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("밑 입력 : ");
		int base  = sc.nextInt();
		System.out.print("지수 입력 : ");
		int n = sc.nextInt();
		int result = powerN(base , n);
		System.out.println("결과 확인 : " + result);
		
	}
	public static int powerN(int base , int n) {
	// base 를 n 번 곱함
		int result = base;
		for (int i = base ; n >= 0 ; n--) {
			result = i*i;
			
		} return result;
		
	}

}
