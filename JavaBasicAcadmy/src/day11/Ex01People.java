package day11;

public class Ex01People {
	
	
//	사람을 만들 수 있는 설계도
//	설계도 = 클래스
//	클래스 구조
//	1 .field = 속성 , 특성 , 정의할 수 있는 데이터
//	이름 나이 키 몸무게 성별 등
	String name ;
	double height;
	String gender;
	
	
//	2. method
//	말하기, 걷기, 코딩하기, 잠자기
//	main method 없음 / static 키워드 사용 X
	
	public void talk() {
		System.out.println("재잘재잘 말하기");
	}
	
	public void coding() {
		System.out.println("뚝딱뚝딱 개발하기");

	}
	public void sleep () {
		System.out.println("Zzzzz....");
	}

}
