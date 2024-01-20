package day1;

import java.util.Scanner;

public class Bonus4 {

	public static void main(String[] args) {

		//사용자에게 입력받아 배열이 인덱스 만큼 별을 출력하시오
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[5];
		for (int i = 0 ; i <arr.length; i ++) {
			System.out.print((i+1) + "번째 별의 수 : ");
			int num = sc.nextInt();
			arr[i] = num;
			
		}
		for(int i =0; i <arr.length; i++) {
			System.out.print(arr[i] + ":");
			for(int j = 0 ; j< arr[i]; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		
		
	}

}
