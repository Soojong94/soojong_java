package musicplayer;

import java.util.ArrayList;

public class Music {

	// class 는 내가 저장하고 싶은 데이터를 저장할 수 잇는 데이터 타입이다

	private String singer; // 가수
	private String title; // 제목
	private int time; // 시간초
	private String path; //실제 노래 경로

	
	
	// 기본 생성자
	// 리턴타입X , 클래스 이름과 동일, 객체를 생성할때만 호출

	// 우회 메소드 : 데이터 보호 목적
	// 걸러줄 수 있음(필드로 값이 바로 들어가는 게 아님)

	public Music(String singer, String title, int time , String path) {
		super(); // 상속
		this.singer = singer;
		this.title = title;
		this.time = time;
		this.path = path;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;

	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void musicBank() {
		System.out.print(singer);
		System.out.print(" - " + title);
		System.out.print("(" + time + "초)");
		System.out.println();
	}

	
}
