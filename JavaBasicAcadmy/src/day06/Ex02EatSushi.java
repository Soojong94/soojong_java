package day06;

import java.util.Scanner;

public class Ex02EatSushi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("선수 입장 : ");
		String name = sc.next();
		System.out.println(name);
		System.out.print("선수의 총 칼로리 입력 : ");
		int playerKal  = sc.nextInt();
		System.out.print("스시 한 접시 칼로리 입력 : ");
		int sushiKal = sc.nextInt();
		int count = 0;
		
//		입력 -> 선수 , 300, 30 
//		결과 -> 박병관 선수는 총 10접시의 스시를 먹었습니다. 출력
		
//		입력 -> 선영표, 100 , 30
//		결과 -> 선영표 선수는 총 3접시의 스시를 먹었습니다. 출력
		
		while (playerKal >= sushiKal) {
			playerKal -= sushiKal;
			count++;	
		} System.out.println(name + " 선수는 총 " + count + "접시의 스시를 먹었습니다." );
		
		
	}

}
