package model;

//DTO: Data Transfer Object
//데이터를 저장하고 건내는 용도의 클래스

public class MemberDTO {

	// 필드
	private String id;
	private String pw;
	private String name;
	private int age;

	// 생성자 메소드

	public MemberDTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	// getter 메소드

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
