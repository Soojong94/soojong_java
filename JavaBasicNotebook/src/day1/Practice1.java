package day1;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int t = sc.nextInt();
		System.out.print("목표 몸무게 :");
		int g = sc.nextInt();
		int cnt = 1;
		
		while (t > g) {

			System.out.print(cnt + "주차 감량 몸무게 : ");
			int a = sc.nextInt();
			cnt++;
			t -= a;
		}System.out.println(t + "Kg 달성!! 축하합니다!");
		
	
	}

}
