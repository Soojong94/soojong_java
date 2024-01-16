package day07;

import java.util.Scanner;

public class Ex06팀원찾기 {

	public static void main(String[] args) {

		String[] team = { "안현지", "박민", "박덕근", "김수종", "다마스" };
		Scanner sc = new Scanner(System.in);
		System.out.print("팀원 이름을 입력해주세요 >> ");
		String name = sc.next();
		// 문제
		// 입력 ) 박병관
		// 결과 ) 박병관은 3번째 위치에 존재합니다.
		// 입력 ) 나예호
		// 결과 ) 나예호는 4번째 위치에 존재합니다.

		boolean isCheck = true; // 멤버 판별 변수

		for (int i = 0; i < team.length; i++) {
			if (name.equals(team[i])) {
				System.out.println(name + " 은(는)" + (i + 1) + "번째 위치에 존재합니다");
				isCheck = !isCheck;
				break;
			} else if (i + 1 == team.length) {
				System.out.println(name + " 은(는) 존재하지 않습니다.");
			}

//		if (isCheck) {
//			System.out.println(name + " 은(는) 존재하지 않습니다.");

		}
	}
}

//		}if(isCheck) {
//			System.out.println(name + " 은(는) 존재하지 않습니다.");
//		}

// 심화문제
// 입력) 손흥민
// 결과) 손흥민은 존재하지 않습니다.(한번만 출력)
