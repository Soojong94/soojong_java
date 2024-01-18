package javaFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> num1 = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "번째 정수 입력 : ");
			int num = sc.nextInt();
			if (num % 3 == 0) {
				num1.add(num);
			}
			
		}
		System.out.print("3의 배수 : ");
		for (int i : num1) {
			System.out.print(i + " ");
		}
	
	}

}
