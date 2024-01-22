package javaFestival;

public class Practice13 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] score2 = score.split(",");
		int countA = 0;
		int countB = 0;
		int countC = 0;
		int countD = 0;
		int countF = 0;

//		for (int i = 0; i < score2.length; i++) {
//			if (score2[i].equals("A")) {
//				countA++;
//			} else if (score2[i].equals("B")) {
//				countB++;
//			} else if (score2[i].equals("C")) {
//				countC++;
//			} else if (score2[i].equals("D")) {
//				countD++;
//
//			} else if (score2[i].equals("F")) {
//				countF++;
//			}
//		}
//		System.out.println("A등급 : " + countA);
//		System.out.println("B등급 : " + countB);
//		System.out.println("C등급 : " + countC);
//		System.out.println("D등급 : " + countD);
//		System.out.println("F등급 : " + countF);

		// *******************************************************//
		for (String s : score2) {
			switch (s) {
			case "A":
				countA++;
				break;
			case "B":
				countB++;
				break;
			case "C":
				countC++;
				break;
			case "D":
				countD++;
				break;
			case "F":
				countF++;
				break;

			}

		}
		System.out.println("A등급 : " + countA);
		System.out.println("B등급 : " + countB);
		System.out.println("C등급 : " + countC);
		System.out.println("D등급 : " + countD);
		System.out.println("F등급 : " + countF);
	}
}
