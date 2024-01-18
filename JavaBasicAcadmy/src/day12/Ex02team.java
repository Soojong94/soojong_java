package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02team {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> team = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = sc.next();
			team.add(name);
		}

		System.out.print("SMH의 팀원은 ");

		for (String i : team) {
			System.out.print(i + " ");
		}

		System.out.println("입니다.");

		// 팀원 퇴출시키기

//		1. 퇴출할 팀원 이름 입력받기

		System.out.print("퇴출 시킬 팀원 : ");
		String getOut = sc.next();
		
//		2. team ArrayList의 0 ~ 마지막 인덱스를 검사한 후에


		for (int i = 0; i < team.size(); i++) {
			
//			내가 입력한 팀원이 있으면 삭제 후 
			
			if (team.get(i).equals(getOut)) {
				team.remove(getOut);
				break;
			}
		}
		
//		다시 팀원 출력
		
		System.out.print("SMH의 팀원은 ");

		for (String i : team) {
			System.out.print(i + " ");
		}

		System.out.println("입니다.");



	}
}
