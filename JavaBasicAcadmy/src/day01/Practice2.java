package day01;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {

//		1. 박수게임 3 6 9 일때 박수  / 5 일 때 으악

//	    10으로 나눴을 때 나머지가 369면 박수 5면 으악

//		for (int a = 1; a <= 50; a++) {
//			int num = a % 10;
//			if (num == 3 || num == 6 || num == 9) {
//				System.out.println("박수");
//			} else if (a % 10 == 5) {
//				System.out.println("으악");
//			} else {
//				System.out.println(a);
//			}
//
//		}

//========================================================================

//		2. 홀수는 양수 / 짝수는 음수

//		for (int a = 1 ; a <=100 ; a++) {
//			if (a % 2 == 0) {
//				System.out.print(-a + " ");}
//			else {System.out.print(a + " ");};
//			}

//========================================================================

//		3. 원하는 구구단 출력 (단 + 배수)

//		Scanner sc = new Scanner(System.in);
//		System.out.print( " 원하는 단 :");
//		int a = sc.nextInt();
//		System.out.print( " 원하는 배수 ");
//		int b = sc.nextInt();
//		
//		for (int i = 1; i <= b ; i++) {
//			System.out.println(a + "*" + i + "=" + a * i );
//		}

		// ========================================================================

//		4. 9단까지 출력(제목에 단 달아서)

//		for(int a = 2 ; a <= 9 ; a++){
//			System.out.println(a + " 단 ");
//		for(int b = 1 ; b<=9 ; b++) {
//			System.out.println( a + "*" + b + "=" + a*b);
//		} System.out.println();
//		}
//========================================================================		

//		5. 단 별로 가로로 9단까지 출력

//		for (int a = 2; a<=9; a++) {
//			System.out.print(a + "단 : ");
//			for(int b=1 ; b<=9 ; b++ ) {
//				System.out.print(a + "*" + b + "=" + a*b + "\t" );
//			}System.out.println();
//		}

//========================================================================			

//		6. 단 별로 세로로 9단까지 출력
//		for (int a = 1 ; a<=9 ; a++) {
//			for(int b = 2 ; b<=9; b++ ) {
//				System.out.print(b + " * " + a + " = " + b*a + "\t");
//			}System.out.println();
//		}
//========================================================================	

//		7. 1개부터 5개까지 별찍기

//		for(int a = 1 ; a <=5 ; a++) {
//			for(int b = 1; b<=a ; b++) {
//				System.out.print("*");
//			}System.out.println();
//		}		

		// ========================================================================

//		8. 5개부터 1개까지 별찍기

//		for (int a = 5; a >= 1; a--) {
//			for (int b = 1; b <= a; b++) {
//				System.out.print("*");
//			}System.out.println();
//			
//
//		}

//========================================================================			

//		9. 공백 5개 별 1개 -> 공백 4개 별2개 순서대로 찍기

//		for (int a = 5; a >= 1; a--) {
//			for (int b = 1; b <= a; b++) {
//				System.out.print(" ");
//			}
//			{
//				for (int c = 5; c >= a; c--) {
//					{
//						System.out.print("*");
//					}
//				}
//			}
//			System.out.println();
//
//		}

//========================================================================	//

//		9-1 . 공백 10개 별 0개

//		for (int i = 10 ; i >=1 ; i-- )
//		{
//			for (int j = 1 ; j <=i ; j++) {
//				System.out.print("-");}
//			for (int j = 10 ; j >=i ; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//========================================================================	

//		10. 입력된 약수 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력된 정수 :");
//		int a = sc.nextInt();
//		System.out.print(a + " 의 약수 :");
//		
//		for (int b = 1 ; b<=a ; b++) {
//			if (a % b == 0) {
//				System.out.print(b + "\t");
//			}
//		}

//========================================================================			

//		11. 2~30 약수 구하기
//
//		for (int a = 2; a <= 30; a++) {
//			System.out.print(a + " 의 약수 :  ");
//			for (int b = 1; b <= a; b++) {
//				if (a % b == 0) {
//					System.out.print( b + " ");
//				}
//			}System.out.println();
//		}
//========================================================================

//		12. 완전수 구하기(완전수 : 자신을 제외한 약수의 총합이 자신과 같은 수) 
//		int sum = 0;
//		for (int i = 1 ; i <=1000 ; i++) {
//			sum=0;
//			for(int j = 1 ; j <i ; j++) {
//				if(i % j == 0) { 
//					sum+=j;}
//			}
//		
//	  if(sum == i) {
//	  System.out.println(i);}
//						
//					}
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++) {
//
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					sum += j;
//				}
//			}
//			if (sum == i) {
//				System.out.println(i);
//
//			}
//			sum = 0;
//
//		}

//				int sum = 0;
//
//				for (int i = 1; i <= 1000; i++) {
//					for (int j = 1; j < i; j++) {
//						if (i % j == 0)
//							sum += j;
//					}
//					if (sum == i)
//						System.out.println(i);
//					sum = 0;// 약수의 총합 리셋
//				}
		// ========================================================================
//		13. 난수 플러스게임 (랜덤 수 더하기 + 틀리면 다시 /  맞으면 다른 문제 + N이면 탈출 / Yes 는 다시 문제풀기)

//		Random ran =new Random();
//		int num1  = ran.nextInt(100)+1;
//		int num2  = ran.nextInt(100)+1;
//		Scanner sc = new Scanner(System.in);
//		int answer = 0;
//		
//		System.out.println("===Plus Game===");
//		while(true) {
//			int result = num1 + num2;
//			System.out.println(num1 + "+" + num2 +"=");
//			answer =sc.nextInt();
//			if(result == answer) {
//				System.out.println("Success");
//				num1  = ran.nextInt(100)+1;
//				num2  = ran.nextInt(100)+1;
//			}else {
//				System.out.println("Fail");
//			}System.out.println("계속 하시겠습니까?");
//			String response = sc.next();
//			if(response.equals("N")||response.equals("n")) {
//				break;}
//			
//			
//		}System.out.println("게임이 종료되었습니다");

//		Random ran = new Random();
//		Scanner sc = new Scanner(System.in);
//		int num1 = ran.nextInt(50) + 1;
//		int num2 = ran.nextInt(50) + 1;
//		int answer = 0;
//
//		while (true) {
//			System.out.println("===Plus Game===");
//			int result = num1 + num2;
//			System.out.println(num1 + "+" + num2 + "=");
//			answer = sc.nextInt();
//			if (result == answer) {
//				System.out.println("Success");
//				num1 = ran.nextInt(50) + 1;
//				num2 = ran.nextInt(50) + 1;
//			} else {
//				System.out.println("Fail");
//			}
//			System.out.println("계속 하시겠습니까?");
//			String response = sc.next();
//			if (response.equals("N") || response.equals("n")) {
//				break;
//			}
//
//		}
//		System.out.println("게임이 종료되었습니다.");

		// ========================================================================

//		14. 큰 수 찾기

//		int[] array = new int[5];
//		array[0] = 15;
//		array[1] = 16;
//		array[2] = 17;
//		array[3] = 19;
//		array[4] = 101;
//		int max = 0;
//		
//		for (int i = 0 ; i < array.length ; i++) {
//			max = array[0];
//			if (max < array[i]) {
//				max = array[i];
//			}
//			} System.out.println(max);
//	
//		
//		
//		
		// ========================================================================

//		15.총합과 평균 그리고 짝수
		// 문제
		// 콘솔창에 아래와 같이 결과가 나오게 해주세요
		// 총합 : 430
		// 평균 : 33.07692307...
		// 짝수 개수 : 5

//		int[] array = { 55, 57, 56, 12, 13, 9, 8, 11, 72, 99, 24, 11, 3 };

//========================================================================		

//		16. 수박게임 
//		입력 받은 숫자만큼 번갈아가면서 '수', '박' 출력

//	   String [] a = {"수" , "박"};
//	   Scanner sc = new Scanner(System.in);
//	   System.out.println("===수박게임===");
//	   System.out.print("숫자 입력 :");
//	   int b = sc.nextInt();
//	   
//	   for (int i = 0 ; i < b; i++) {
//			System.out.print(a[i%2]);}

//===================================================

//		※※※※※※17. 팀원찾기 배열안에 팀원 이름을 넣고 이름 입력하면 몇번째 자리에 있는지 찾아줄 것
//		없으면 찾을 수 없다고 출력※※※※※

//		String[] name = { "안현지", "박민", "김수종", "박덕근" };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		String answer = sc.next();
//
//		for (int i = 0; i < name.length; i++) {
//			if (name[i].equals(answer)) {
//				System.out.println(name[i] + "는(은)" + i + "번째 자리에 있습니다");
//				break;
//			} else if (i +1 == name.length) {
//				System.out.println("대상을 찾을 수 없습니다");
//				
//			}
//		}

//===================================================

//		※※※※※※18. 채점 프로그램 스캐너에 답 입력해서 답 맞으면 +20 점 해서 채점해보기※※※※※※

//		int[] Score = { 1, 2, 3, 4, 5 };
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int[] answer = new int[5];
//
//		for (int i = 0; i < Score.length; i++) {
//			System.out.print(i + 1 + "번째 정답 입력 : ");
//			answer[i] = sc.nextInt();
//		}
//		System.out.println("정답 여부  ");
//
//		for (int i = 0; i < Score.length; i++) {
//
//			if (answer[i] == Score[i]) {
//				sum += 20;
//				System.out.print(" O \t");
//			} else {
//				System.out.print(" X \t");
//			}
//		}
//		System.out.println();
//		System.out.println("총점 : " + sum);

//===================================================

//		19. 별찍기 :  배열에 입력된 숫자만큼 별 찍기 
//		ex ) 3 : ***

//		int [] star = new int[5];
//		Scanner sc =new Scanner (System.in);
//		
//		for(int i = 0 ; i < star.length; i++) {
//			
//			System.out.print(i+1 + " 번째 별 개수 입력 : ");
//			star[i] =  sc.nextInt();
//		 for (int j = 0 ; j < star[i] ; j++) {
//			System.out.print("*");	
//		}System.out.println();
//		}
//		
//		
//		int [] star2 = {1,2,3,4,5};
//		for(int i = 0 ; i < star2.length; i++) {
//			for(int j = 0 ; j < star[i] ; j++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		
//		
//		
//		//			if (array[i + 2] > array[i + 1]) {
//		a = array[i + 2];
//		array[i + 2] = array[i + 1];
//		array[i + 1] = a;
//	}
//	if (array[i + 3] > array[i + 2]) {
//		a = array[i + 3];
//		array[i + 3] = array[i + 2];
//		array[i + 2] = a;

// 버블 정렬 종료
//		

		// ===================================================
//		20. 지그재그

//				for (int j = 0; j < array.length; j++) {
//		if (j % 2 == 0) {
//			for (int i = 0; i < array.length; i++) {
//				array[i][j] = count;
//				count++;
//			}
//		} else {
//			for (int i = array.length - 1; i >= 0; i--) {
//				array[i][j] = count;
//				count++;
//			}
//		}
//
//	}
//	for (int[] i : array) {
//		for (int j : i) {
//			System.out.print(j + "\t");
//		}
//		System.out.println();
//	}

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				a[i][j] = cnt;
//				cnt++;
//				
//			}
//		}

//		int[][] a = new int[5][5];
//		int cnt = 1;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				a[i][j] = cnt;
//				cnt++;
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			if (i % 2 == 0) {
//				for (int j = 0; j < a.length; j++) {
//					System.out.print(a[i][j] + "\t");
//
//				}
//				System.out.println();
//			} else {
//				for (int j = a.length - 1; j >= 0; j--) {
//					System.out.print(a[i][j] + "\t");
//				}
//				System.out.println();
//			}
//		}
//	}

		/* 변수를 따로 저장하는 방법 */

// int[][] array = new int[5][5];
//
//	      int temp2 = 9;
//	      int temp3 = 1;
//	      int temp = 0;
//	      
//	      for (int i = 0; i < array.length; i++) {
//	         temp = i + 1;
//	         for (int j = 0; j < array.length; j++) {
//	            if (j % 2 == 0) {
//	               array[i][j] = temp;
//	               System.out.print(array[i][j]+"\t");
//	               temp = temp + temp2;
//	            } else {
//	               array[i][j] = temp;
//	               System.out.print(array[i][j]+"\t");
//	               temp = temp + temp3;
//	            }
//	         }
//	         temp2 = temp2 - 2;
//	         temp3 = temp3 + 2;
//	         temp = 0;
//	         System.out.println();
//	      }

//	//************************추가숙제
//    Scanner sc = new Scanner(System.in);
//    //                      병관             주희             범식
//  int[][] score = { { 98, 78, 70 }, { 88, 76, 65 }, { 43, 21, 11 } };
//  String[] subject = { "국어", "수학", "영어" };
//  
//  System.out.print("1.병관 2.주희 3.범식 >> ");
//  int stu = sc.nextInt();
//  
//
//  for (int i = 10; i >= 1; i--) {
//
//     System.out.print(i * 10 + "\t");
//
//     for (int j = 0; j < score[stu - 1].length; j++) {
//        if (score[stu - 1][j] >= i * 10) {
//           System.out.print("*\t");
//        } else {
//           System.out.print(" \t");
//        }
//     }
//     System.out.println();
//  }
//  
//  System.out.print(" \t");
//  
//  for(int i = 0; i <subject.length; i++) {
//     System.out.print(subject[i] + "\t");
//     
//  }

//	 * **************************


//		while (true) {
//			System.out.println("===메뉴 정하기===");
//			System.out.println(""");
//			int choice = sc.nextInt();
//
//			if (choice == 1) {
//				System.out.println("===분야를 골라주세요===");
//				System.out.println("1.한식  2.일식 3.중식 4.분식");
//				int menu = sc.nextInt();
//				int a = menu - 1;
//				int b = fList[a].length;
//				System.out.println(fList[a][ran.nextInt(b)]);
//				
//			} else if (choice == 2) {
//				System.out.println("===식당 선택===");
//				int a = ran.nextInt(fList.length);
//				int b = ran.nextInt(fList[a].length);
//				System.out.println(fList[a][b]);
//				
//			} else if (choice == 3) {
//				System.out.println("추첨을 종료합니다");
//				break;
//			} else {
//				System.out.println("다시 입력해주세요(1번~3번)");
//			}
//		}
//		String[][] fList = { { "대접", "청춘뚝배기", "해뜨는집", "그냥집밥", "신신식당", "명덕식당" }, { "쿠로시오", "마시타", "런오프타마고", "스시" },
//				{ "1515", "황금성", "열도지" }, { "수김밥", "고봉민김밥", "한솥", "엄마의식탁" } }; // 2차원배열 + 비정방형배열
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//
//		
//		while(true) {
//			System.out.println("===랜덤 식당 뽑기===\n 1. 분야별 랜덤 2. 전체 랜덤 3. 종료");
//			int menu = sc.nextInt();
//			if(menu==1) {
//				System.out.println("===분야를 골라주세요===\n 1.한식 2.일식 3.중식 4.분식");
//				int choice = sc.nextInt();
//				int a = choice-1;
//				int b = ran.nextInt(fList[a].length); 
//				System.out.println("===식당선택===\n"+ fList[a][b] +"\n");
//						
//			}else if(menu==2) {
//				System.out.println("===식당 선택===");
//				int a = ran.nextInt(fList.length);
//				int b = ran.nextInt(fList[a].length); 
//				System.out.println(fList[a][b] + "\n");
//			}else if(menu==3) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}else {
//				System.out.println("잘못된 입력 값입니다. ");
//			}System.out.println("아래에 다시 입력해주세요");
//		}
		
//		 * **************************//	 * **************************
		
//		10과의 거리를 구하려면 -10을 해서 절대값을 씌우면 된다는 걸 생각 못함
//
//		if (a >= 10 && b >= 10) {
//		if (a == b) {
//			result = 0;
//		} else {result = a > b? b : a; 
//		}
//
//	} else if (a >= 10 && b < 10) {
//		if (c > (d) * (-1)) {
//			result = b;
//		} else {
//			result = a;
//		}
//	} else if (a < 10 && b < 10) {
//		if ((c) * (-1) > (d) * (-1)) {
//			result = b;
//		} else {
//			result = a;
//		}
//
//	} else if (a < 10 && b >= 10) {
//		if ((c) * (-1) > d) {
//			result = b;
//		} else {
//			result = a;
//		}
//	}
//	return result;
//
//}
		

//if (a >= 10 && b >= 10) {
//	if( a==b){
//result = 0;
//}else if((a>b) ? return = a : return= b){
//
//}
//
		
	}
}
