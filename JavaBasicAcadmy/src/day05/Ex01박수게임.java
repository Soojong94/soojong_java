package day05;

public class Ex01박수게임 {

	public static void main(String[] args) {

		for (int number = 1; number <= 50; number++) {
			if (number % 10 == 3) {
				System.out.println("박수");
			} else if (number % 10 == 6) {
				System.out.println("박수");
			} else if (number % 10 == 9) {
				System.out.println("박수");
			} else if (number % 10 == 5) {
				System.out.println("으악");
			} else {
				System.out.println(number);
			}
		}
		for (int num1 = 1; num1 <= 50; num1++) {
			int num2 = num1 % 10;

			if (num2 == 3 || num2 == 6 || num2 == 9) {
				System.out.println("박수");

			} else if (num2 == 5) {
				System.out.println("으악");
			} else {
				System.out.println(num1);
			}
		}
	}
}
