package day1;

public class Practice13 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		for (int i = 0; i < score.length(); i++) {
			char s = score.charAt(i); // 문자열 안의 글자를 char 로 변환하는 방법
			if (s == 'A')// 문자 s 가 A와 일치하는지 확인
			{
				cntA++;

			} else if (s == 'B') {
				cntB++;

			} else if (s == 'C') {
				cntC++;

			} else if (s == 'D') {
				cntD++;

			} else if (s == 'F') {
				cntF++;

			}
		}
		System.out.println("A : " + cntA + "명");
		System.out.println("B : " + cntB + "명");
		System.out.println("C : " + cntC + "명");
		System.out.println("D : " + cntD + "명");
		System.out.println("F : " + cntF + "명");
	}
}
