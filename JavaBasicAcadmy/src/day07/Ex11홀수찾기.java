package day07;

public class Ex11홀수찾기 {

	public static void main(String[] args) {

		int [] array = {1,9,6,8,12,15,16,18,22,27,31,35,40};
		
		// 문제
		// 홀수의 개수를 찾아 출력문으로 알려주세요
		// 실행 결과) 홀수 개수 : 6
		
		int count =0;	//홀수 체크 변수
		
		for ( int i : array) {
			if(i % 2 == 1) {
				count++;
			}
		}System.out.println("실행 결과 ) 홀수 개수 : " + count);
		int [][] num = new int [5][3];
		num[0][1] = 20;
		num[0][0] = 50;
		System.out.println(num[0][1] + num [0][0]);
	}

}
