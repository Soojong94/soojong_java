package day07;

import java.util.Scanner;

public class Ex05수박게임 {

	public static void main(String[] args) {

		char[] text = { '수', '박' };
		Scanner sc = new Scanner(System.in);

		System.out.println("====수박 게임 Start!====");
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();

//		for (int i = 0; i < num; i++) {		
//				System.out.print(text[ i % 2 ] );
//		}
		
		int i =0;
	    while(i < num) {
	    	System.out.print(text[i%2]);
	    	i++;
	    }
	}
}
