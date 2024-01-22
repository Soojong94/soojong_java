package day1;

public class Practice13 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");
		int A = 0, B = 0, C = 0, D = 0, F = 0;

		for (String s : arr) {
			switch (s) {
			case "A":
				A++;
				break;
			case "B":
				B++;
				break;
			case "C":
				C++;
				break;
			case "D":
				D++;
				break;
			case "F":
				F++;
				break;
			}

		}
		System.out.println("A : " + A + "명");
		System.out.println("B : " + B + "명");
		System.out.println("C : " + C + "명");
		System.out.println("D : " + D + "명");
		System.out.println("F : " + F + "명");

	}

}
