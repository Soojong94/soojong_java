package day1;

public class practice3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1 ; i <=100 ; i++) {
		if(i % 2 == 1) {
			sum += i;
			System.out.print(i + "\t");
		}else if(i % 2 == 0){
			sum += i*(-1);
			System.out.print(-i+ "\t");
		}
	} System.out.println();
	  System.out.println("결과 : " + sum);

	}

}
