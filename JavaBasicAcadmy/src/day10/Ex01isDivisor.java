package day10;

import java.util.Scanner;

public class Ex01isDivisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		boolean result = isDivisor(num1 , num2 );
		System.out.println(result);
		
	} public static boolean isDivisor(int num1 , int num2) {
		
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
	
	}

}
