package day1;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a = sc.nextInt();
		if(a % 10 >= 5 ) {
			System.out.println("반올림 수 : " + (a / 10 + 1) * 10);
		}else if(a % 10 <5  )
		{
			System.out.println("반올림 수 : "  + a / 10 *10);
		}
	}

}
