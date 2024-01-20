package day11;

public class People {

//	사람을 만들 수 있는 설계도
//	설계도 = 클래스
//	클래스 구조
//	1 .field = 속성 , 특성 , 정의할 수 있는 데이터
//	이름 나이 키 몸무게 성별 등
	
	
//	public (생략) ->private 등으로 바꿀 수 있음
	String name;
//	public (생략)
	double height;
//	public (생략)
	String gender;
//	public (생략)
	String favorite;
	
	// 생성자 메소드 default constructor (기본 생성자)
	// 생성자가 없는 클래스는 X (무조건 존재)
	// 기본 생성자 메소드 이외의 또 다른 생성자 메소드를 만들면 default 메소드가 사라짐
	// 사용하고 싶으면 다시 만들어줘야함
	// 리턴타입이 없음( int 등 , void도 없음) 
	// 생성자 메소드 이름 = 클래스 이름
	// 생성자 메소드도 오버로딩이 가능하다
	
	public People () {
		
	}

	
	// this -> 현재 메소드가 존재하는 클래스의 필드 값을 가리킴
	
public People(String name, double height, String gender, String favorite) {
		super();
		this.name = name;
		this.height = height;
		this.gender = gender;
		this.favorite = favorite;
	}

//	2. method
//	말하기, 걷기, 코딩하기, 잠자기
//	main method 없음 / static 키워드 사용 X

	public void talk() {
		System.out.println("재잘재잘 말하기");
	}

	public void coding() {
		System.out.println("뚝딱뚝딱 개발하기");

	}

	public void sleep() {
		System.out.println("Zzzzz....");
	}
	public void work() {
		System.out.println("Tired");
	}

}
