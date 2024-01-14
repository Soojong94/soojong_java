package day6;

import java.util.Random;
import java.util.Scanner;

public class Ex05plusgame {

	public static void main(String[] args) {
		
	      // 난수(랜덤 숫자)뽑는 방법
	      Random ran = new Random();
	      Scanner sc = new Scanner(System.in);

	      int num1 = ran.nextInt(100) + 1;
	      int num2 = ran.nextInt(100) + 1;
	      int answer = num1 + num2;
	      
	      while(true) {
	         System.out.println("==Plus Game==");
	         System.out.print(num1 + "+" + num2 + "=");
	         int result = sc.nextInt();
	   
	         if (answer == result) {
	            System.out.println("Success");
	            num1 = ran.nextInt(100) + 1;
	            num2 = ran.nextInt(100) + 1;
	            answer = num1 + num2;
	         } else {
	            System.out.println("Fail");
	         }
	         
	         System.out.print("계속 하시겠습니까? >>");
	         String next = sc.next();
	         if(next.equals("N") || next.equals("n")) {
	            System.out.println("게임을 종료합니다.");
	            break;
	         }
	      }
	   }
	}
