package day10;

import java.util.Arrays;

public class Ex05score {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] scores = score.split(",");

		int cntA = 0;
		int cntB = 0;
		int cntC = 0;
		int cntD = 0;
		int cntF = 0;

		for (int i = 0; i < scores.length; i++) {
			if (scores[i].equals("A")) {
				cntA++;
			} else if (scores[i].equals("B")) {
				cntB++;
			} else if (scores[i].equals("C")) {
				cntC++;
			} else if (scores[i].equals("D")) {
				cntD++;
			} else if (scores[i].equals("F")) {
				cntF++;
			}
		}
		System.out.println("A등급 : " + cntA);
		System.out.println("B등급 : " + cntB);
		System.out.println("C등급 : " + cntC);
		System.out.println("D등급 : " + cntD);
		System.out.println("F등급 : " + cntF);
	}
}

//	System.out.println(Arrays.toString(scores));

//		for (String  i : scores) {
//			System.out.print(i + " ");
//		}
//			
