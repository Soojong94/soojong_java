package day05;

public class Ex12완전수 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sum += j;
			}
			if (sum == i)
				System.out.println(i);
			sum = 0;// 약수의 총합 리셋
		}

	}
}
