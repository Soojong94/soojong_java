package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.MemberDAO;
import model.MemberDTO;
import oracle.net.aso.s;

public class MainSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		// 모든 기능에서 사용할 수 있도록 전역변수 dto, dao 생성
		
		MemberDTO dto = null;
		MemberDAO dao = new MemberDAO();

		while (true) {
			// CRUD (create / read / update / delete)
			System.out.print("1.회원등록 2.로그인 3.회원목록 4.회원탈퇴 5.회원정보수정 6.프로그램 종료 >>> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("======회원등록=====");
				System.out.print("ID입력 : ");
				String id = sc.next();
				System.out.print("PW입력 : ");
				String pw = sc.next();
				System.out.print("이름입력 : ");
				String name = sc.next();
				System.out.print("나이입력 : ");
				int age = sc.nextInt();

				dto = new MemberDTO(id, pw, name, age);
				
				int cnt = dao.join(dto);

				if (cnt > 0) {
					System.out.println("회원 등록 성공");
				} else {
					System.out.println("회원 등록 실패");
				}

			} else if (menu == 2) {
				System.out.println("=====로그인=====");
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				
				dao.login(id, pw);
				
			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}

	}

}
