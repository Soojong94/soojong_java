package day5;

public class Ex02양수와음수 {

	public static void main(String[] args) {

		for (int a = 1; a <= 100; a++) {
			if (a % 2 == 0)
				System.out.print((a * -1) +" "); //a 앞에 "-" 붙여도 됨
			else {
				System.out.print(a + " ");
			}

		}

	}
}
