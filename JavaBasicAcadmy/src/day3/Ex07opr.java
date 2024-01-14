package day3;

import java.util.Scanner;

public class Ex07opr {

	public static void main(String[] args) {

		
		// 사용자로부터 정수를 입력 받아
		// 만약 20이상이라면
		// "성인입니다" 문구 출력
		// 20 미만이라면
		// "미성년자 입니다 " 문구 출력
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("나이를 입력해주세요 : ");
	    
		int age = sc.nextInt();		
	    String result = (age >= 20) ? ("성인입니다") : 
	    ((age < 8) ? ("유아입니다") : ("미성년자입니다"));
		System.out.println(result);
		
	      // 1. 입력받기 위한 도구 Scanner 생성
	      // 2. 출력 문구 "나이를 입력하세요 : "
	      // 3. 입력 받은 값을 int age에 저장
	      // 4. 만약, age가 20이상이라면 "성인입니다"
	      // age가 20미만이라면 "미성년자입니다" 라는 문자열을
	      // String result에 저장
	      // 5. result 출력!
		
		
	}

}
