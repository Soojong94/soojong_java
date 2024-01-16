package day06;

public class Ex03break {

	public static void main(String[] args) {

		int cnt = 0;

		while (true) {
			cnt++;
			System.out.println(cnt + "안녕! ");
			if (cnt == 10) {
				break;
			} // break 는 가장 가까운 반복문 1개를 끝낸다
		}
		System.out.println("끝!");

	}

}
