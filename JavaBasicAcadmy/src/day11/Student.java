package day11;

public class Student {

	String name;
	int number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	// 메소드
	public void show() {
		
		System.out.println(name + "님 안녕하세요. \n[" + number + ",  " + age + "살]\n" + name + "님의 Java 점수는 " + scoreJava
				+ "점 입니다.\n" + name + "님의 Web 점수는 " + scoreWeb + "점 입니다.\n" + name + "님의 Android 점수는 " + scoreAndroid
				+ "점 입니다.\n===============================");
//	f 프린팅
//	[number , age 살]
//		System.out.printf("[%d,%d살]",number,age);
		
	}

	// 모든 필드값을 생성과 동시에 초기화 할 수 있는 메소드

	public Student(String name, int number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;

	}

	public Student() {

	}

}
