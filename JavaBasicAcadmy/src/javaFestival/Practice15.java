package javaFestival;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		int count =1;
		
		for (int i = 0 ; i < n ; i++) {
			count +=i;
			System.out.print(count + " ");
		}
	}

}
