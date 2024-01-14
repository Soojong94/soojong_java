package day6;

import java.util.Scanner;

public class Ex04다이어트 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int nowWeight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goalWeight = sc.nextInt();
		int week = 1;

		while (nowWeight > goalWeight) {
				System.out.print(week + "주차 감량 몸무게 : ");
				week++;
				int dietWeight = sc.nextInt();
			    nowWeight -= dietWeight;
//				if (nowWeight <= goalWeight) {
//					break;
				}
			
		
		System.out.println(nowWeight + " kg 달성!! 축하합니다!");

	}

}
