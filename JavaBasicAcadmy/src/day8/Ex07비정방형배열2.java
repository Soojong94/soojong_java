package day8;

import java.util.Random;
import java.util.Scanner;

public class Ex07비정방형배열2 {

	public static void main(String[] args) {

		String[][] fList = { { "대접", "청춘뚝배기", "해뜨는집", "그냥집밥", "신신식당", "명덕식당" }, { "쿠로시오", "마시타", "런오프타마고", "스시" },
				{ "1515", "황금성", "열도지" }, { "수김밥", "고봉민김밥", "한솥", "엄마의식탁" } }; // 2차원배열 + 비정방형배열

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		while (true) {
			System.out.print("1. 분야별 추천 2. 전체 랜덤 추천 3. 종료 >>");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("===분야별 추천===");
				System.out.println("원하는 분야를 선택해주세요");
				System.out.print("1.한식\t2.일식\t3.중식\t4.분식>>");
				int choice = sc.nextInt();
				int row = choice - 1;
				int col = ran.nextInt(fList[row].length);
				System.out.println("추첨 결과: " + fList[row][col]);
			} else if (menu == 2) {
				System.out.println("===전체랜덤===");
				int row = ran.nextInt(fList.length);
				int col = ran.nextInt(fList[row].length);
				System.out.println("추첨 결과 : " + fList[row][col]);
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("숫자 입력해라 헛짓거리 하지 말고");

			}

		}

	}

}
