package day1;

import java.util.Scanner;

public class Practice19 {

	public static void main(String[] args) {
// 단수와 곱해지길 원하는 수를 입력하여 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 입력 : ");
		int num1  = sc.nextInt();
		System.out.print("출력될 수 : ");
		int num2 = sc.nextInt();
		System.out.println(num1 + "단");
		
		for (int i = 1; i <=num2 ; i ++) {
			System.err.println(num1 + "*" +  i + "=" + (num1*i) );
			
		}
		
		
		
	}

}
