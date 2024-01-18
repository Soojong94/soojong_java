package day12;

public class Contact {

	 String name;
	 int age;
	 String tel;
	
	//getter 메소드

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getTel() {
		return tel;
	}
	
	

	public Contact(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}


	public Contact() {

	}
public void showContacts() {
	System.out.printf("%s\t(%d세)\t: %s%n" , name, age, tel);
}
}
