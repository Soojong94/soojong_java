package day1;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int a = sc.nextInt();
		int sum = 0;
		if (a <= 8) {
			int hour1 = a * 5000;
			sum = hour1;
		} else if (a >9)
		{int  hour2 = 40000 + (a-8) * (7500) ; 	
		sum = hour2;
		}System.out.println("총 임금은 " + sum + "원 입니다.");
		


	}

}
