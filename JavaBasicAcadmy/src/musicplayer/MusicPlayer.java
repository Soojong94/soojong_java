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

		}
		if (mp3.isPlaying()) {
			mp3.stop();
		}

	}
}
