package day5;

public class Ex11약수구하기2 {

	public static void main(String[] args) {

		//2부터 30까지의 약수 구하기
		
		// 변수명 바꾸기 단축기 Alt + Shift + 단축키
		
	
		for(int k = 2 ; k <= 30 ; k++) {
			System.out.print(k + "의 약수 : ");
			for (int a = 1; a <= k ; a++) {
				if (k % a == 0)
				System.out.print(a +" ");
			}
			System.out.println();
		  
		}

		
		
		
	}

}
