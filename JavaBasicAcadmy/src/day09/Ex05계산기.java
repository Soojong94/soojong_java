package day09;

public class Ex05계산기 {

	public static void main(String[] args) {

		System.out.println(add(3, 5));
		System.out.println(sub(3, 5));
		System.out.println(mul(3, 5));
		System.out.println(div(3, 5));

	}

	// 더하기 메소드
	public static int add(int a, int b) {

		return a + b;

	}

	// 빼기 메소드
	public static int sub(int a, int b) {
		return a - b;

	}

	// 곱하기 메소드
	public static int mul(int a, int b) {
		return a * b;

	}

	// 나누기 메소드
	public static int div(int a, int b) {
		return a / b;

	}

}
