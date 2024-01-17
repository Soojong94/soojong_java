package day11;

public class StudentNMain {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "홍길동";
		s1.number = 20220614;
		s1.age = 20;
		s1.scoreJava = 60;
		s1.scoreWeb = 80;
		s1.scoreAndroid = 55;
		s1.show();

		Student s2 = new Student();
		s2.name = "김말똥";
		s2.number = 20240117;
		s2.age = 2024;
		s2.scoreJava = 50;
		s2.scoreWeb = 70;
		s2.scoreAndroid = 90;
		s2.show();

		Student s3 = new Student("abc", 107868, 24, 80, 60, 90);
		s3.show();

//System.out.printf("\n[%d,%d살]",s1.number,s1.age);

	}

}
