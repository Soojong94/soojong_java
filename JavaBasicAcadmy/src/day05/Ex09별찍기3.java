package day05;

public class Ex09별찍기3 {

	public static void main(String[] args) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 5; i >= j; i--) {
				System.out.print(" ");
			}{
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			}
			System.out.println();
		}
//		------------------------------------------------------
		
	      for (int i = 0; i <= 4; i++) {
	          for (int j = 1; j <= 5 - i; j++) {
	             System.out.print(" "); // 빈공간
	          }
	          for (int j = 1; j <= 1 + i; j++) {
	             System.out.print("*"); // 별
	          }
	          System.out.println();
	       }

	    }

}
