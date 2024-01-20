package musicplayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	public static void main(String[] args) {

//		뮤직플레이어
//		노래정보 - 제목(String), 가수(String), 시간초(Int)
//		클래스 = 데이터타입
//		노래 객체 하나 생성해보기
//		객체 = 레퍼런스 변수
//		데이터타입 변수명 = new 데이터타입();

		// Music : 생성자

		// 노래 정보를 ArrayList 에 저장

		ArrayList<Music> list = new ArrayList<>();
		Music m1 = new Music("Anne Marie", "2002", 180, "C:\\music_v2\\Anne Marie - 2002.mp3");
		Music m2 = new Music("Billie Eilish", " bad guy", 180, "C:\\music_v2\\Billie Eilish - bad guy.mp3");
		Music m3 = new Music("Carmen Twillie, Lebo M.", " Circle of Life", 180,
				"C:\\music_v2\\Carmen Twillie, Lebo M. - Circle of Life.mp3");
		Music m4 = new Music("CHUNG HA", " 벌써 12시", 180, "C:\\music_v2\\CHUNG HA - 벌써 12시.mp3");
		Music m5 = new Music("Idina Menzel", "Let It Go", 180, "C:\\music_v2\\Idina Menzel - Let It Go.mp3");
		Music m6 = new Music("Itzy", "Dalla Dalla", 180, "C:\\music_v2\\Itzy - Dalla Dalla.mp3");
		Music m7 = new Music("JENNIE", "SOLO", 180, "C:\\music_v2\\JENNIE - SOLO.mp3");
		Music m8 = new Music("Mena Massoud, Naomi Scott", "A Whole New World", 180,
				"C:\\music_v2\\Mena Massoud, Naomi Scott - A Whole New World.mp3");
		Music m9 = new Music("Rain", "깡", 180, "C:\\music_v2\\Rain - 깡.mp3");
		Music m10 = new Music("SHINee", "Ring Ding Dong", 180, "C:\\music_v2\\SHINee - Ring Ding Dong.mp3");
		Music m11 = new Music("TWICE", "FANCY", 180, "C:\\music_v2\\TWICE - FANCY.mp3");
		Music m12 = new Music("이하이", "NO ONE", 180, "C:\\music_v2\\이하이 - NO ONE.mp3");

		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		list.add(m7);
		list.add(m8);
		list.add(m9);
		list.add(m10);
		list.add(m11);
		list.add(m12);

		Scanner sc = new Scanner(System.in);
		int point = 0;

		// mp3 파일을 실행해주는 객체
		MP3Player mp3 = new MP3Player();

//		mp3.play("C:\\music_v2\\Rain - 깡.mp3");
//		mp3.play("C:\\music_v2\\Billie Eilish - bad guy.mp3");

		while (true) {
			System.out.print("1.목록 2.재생 3.이전곡 4.다음곡 5.종료>> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("=============노래 List================");
				// 1.뉴진스 - OMG (182초)
				for (int i = 0; i < list.size(); i++) {
//					System.out.print(i + 1 +".");
//					System.out.print(list.get(i).getSinger() + " - ");
//					System.out.print(list.get(i).getTitle() + " (");
//					System.out.print(list.get(i).getTime() + ")");
//					System.out.println();
					System.out.print(i + 1 + ".");
					list.get(i).musicBank();
				}
				System.out.println();

			} else if (menu == 2) {
				System.out.println("========재생=========");
				System.out.print(point + 1 + ".");
				list.get(point).musicBank();
				System.out.println();
				mp3.play(list.get(point).getPath());
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(list.get(point).getPath());

			} else if (menu == 3) {
				System.out.println("=============이전곡================");
				if (point > 0) {
					point--;
					System.out.print(point + 1 + ".");
					list.get(point).musicBank();
				} else {
					System.out.println("이전 곡이 없습니다.");
				}
				System.out.println();
			} else if (menu == 4) {
				System.out.println("=============다음곡================");
				if (point < list.size() - 1) {
					point++;
					System.out.print(point + 1 + ".");
					list.get(point).musicBank();
				} else {
					System.out.println("다음 곡이 없습니다.");
				}
				System.out.println();
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				mp3.play(list.get(point).getPath());
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다!");
				break;

			} else {
				System.out.println("정확한 숫자를 입력해주세요!");
			}

//		객체지향 특징 4가지
//		캡슐화
//		상속
//		추상화
//		다형성

//			객체 지향 프로그래밍의 특징 
//			추상화 : 객체에서 ★공통된★ 속성(필드)과 행위(메소드)를 추출하는 기법

//=======================================

//			캡슐화 : Encapsulation = 정보를 모으고 간추리는 것
//			관련된 필드와 메소드를 하나로 묶고, 실제 구현 내용을 외부로부터 감추는 기법(정보 은닉)
//			추상화를 하지 못하면 캡슐화 불가 / 반대도 마찬가지
//			외부 조작을 대비해서 사용자가 조작할 수 없도록 숨겨 놓은 것
//			외부에서는 공개된 메소드의 인터페이스를 통해 접근 가능

//=======================================

//			상속 : 이미 작성된 클래스(상위클래스)의 특성을 그대로 이어받아
//			새로운 클래스(하위클래스)를 생성하는 기법
//			기존 코드를 재사용하거나 재정의

//			상위(가장 단순함)	하위(기존 코드를 재정의 : 재사용 +확장)
//			추상화			구체화(상대적)
//			부모				자식
//			슈퍼				서브
//			기존 클래스의 변수와 코드를 재사용(간결화)
//			먼저 작성된 검증된 프로그램을 사용(신뢰성)
//			클래스간 계층적 분류 및 관리(유지보수 용이)
//			횟수 제한 X(상위 클래스 하나씩만 있을 때)
//			상위 클래스 여러 개를 한번에 상속 받을 수는 없음
//			

//=======================================

//			다형성(다양한 형태)
//			같은 기능(메소드)을 호출하더라도 객체에 따라 다르게 동작하는 것
//			상위 클래스의 동작을 하위클래스에서 다시 정의하여 사용하는 것도 당형성
			
//=======================================			
//			※오버로딩 = 중복정의 / 오버라이딩 = 재정의
//			메소드 오버로딩
//			메소드 이름 동일
//			메소드의 매개변수의 개수 , 매개변수의 데이터 타입
//			리턴타입 달라도 됨
			
//			오버라이딩 
//			animal.move(); "움직인다"
//			animal.eat(); "먹는다"
//			dog.move(); -> "쫄랑쫄랑 움직인다"
//			dog.eat(); -> "귀엽게 먹는다"
//			자식 클래스에서 부모 클래스와 동일한 메소드를 재정의 하는 것
//			메소드 이름 동일
//			메소드 매개 변수, 데이터 타입 둘다 동일
//			리턴 타입도 동일
			
//=======================================

//			객체 지향 프로그래밍의 장점
//			신뢰성 있는 소프트웨어를 쉽게 작성할 수 있다.
//			코드를 재사용하기 쉽다.
//			유지보수가 용이하다.
//			직관적인 코드 분석이 가능하다.
//			소프트웨어 생산성이 향상된다.
//=======================================

			
			
			
			
		}
		if (mp3.isPlaying()) {
			mp3.stop();
		}

	}
}
