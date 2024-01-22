package Maple;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MapleRand {

	public static void main(String[] args) {

		// 캐릭터 - 도적 , 전사, 마법사, 궁수

		BasicCharacter w = new Warrior();
		BasicCharacter r = new Rogue();
		BasicCharacter a = new Archer();
		BasicCharacter m = new Magician();

		ArrayList<BasicCharacter> cha = new ArrayList<>();

		cha.add(w);
		cha.add(r);
		cha.add(a);
		cha.add(m);

		cha.add(new Warrior()); 
		
//		업캐스팅(베이직 캐릭터)으로 들어감
//		이름이 없음 : 익명 클래스 방식

//		for (BasicCharacter c : cha) {
//			c.attack();
//			c.avoid();
//			c.move();
//		}
		
		
//==========================================================
		
//		문제
//		1번을 눌렀을 때 위에 캐릭터 중 하나가 랜덤으로 나와서 공격을 하게 하세요

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("1. 랜덤 공격\t2. 랜덤 회피\t3. 랜덤 이동\t 4. 종료 : ");
		while (true) {
			int input = sc.nextInt();
			int output = ran.nextInt(cha.size());
			if (input == 1) {
				cha.get(output).attack();
			} else if (input == 2) {
				cha.get(output).avoid();
			} else if (input == 3) {
				cha.get(output).move();
			} else if (input == 4) {
				System.out.println("게임을 종료합니다.");
				break;
			} else {
				System.err.println("잘못된 입력인디 다시 입력 해유 : ");
			}
		}
		
//		상속을 쓰는 이유 : 코드 간결하게 쓰기 위함
//		중요 : 하나의 데이터 타입으로 공동체 형성 가능
		
	}
}
