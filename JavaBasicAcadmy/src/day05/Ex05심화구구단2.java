package day05;

public class Ex05심화구구단2 {

	public static void main(String[] args) {

		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + " 단 : ");
			for (int i = 1; i <= 9; i++) {
				System.out.print("  " + dan + "*" + i + "=" + dan * i);
			}
			System.out.println();
		}
		
//		for (int k = 1 , j = 10 ;  k<=10 ; k++ , j--)
//		{
//			System.out.printf(" %d \t %d%n " , k ,j);
//		}
	}

}
