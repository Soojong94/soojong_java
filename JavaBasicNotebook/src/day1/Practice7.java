package day1;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 개수 : ");
		int a = sc.nextInt();
		for (int i = a ; i>=1 ; i--) {
			for (int j = 1 ; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
