package day12;

import java.util.ArrayList;

public class Ex01arrayList {

	public static void main(String[] args) {

//		1. 선언 및 생성
//		배열 
		int[] arr = new int[5];

//		arrayList (가변리스트)
//		arrayList <데이터타입> 변수명 = new arrayList <데이터타입(생략가능)> (); : 레퍼런스 변수
//		데이터 타입은 객체 타입(Class)
//		생성 시에 크기 지정 X

//		         정수데이터타입 이름               데이터타입 생략가능
		ArrayList<Integer> arrList = new ArrayList<>();

		System.out.println("배열의 길이 : " + arr.length);
		
//  	size -> 길이를 알 수 있는 코드
		System.out.println("ArrayList 의 길이 : " + arrList.size());
		
//		2. 값 추가
//		배열 
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
//		ArrayList -> 변수명.add(값) : 순차적으로 인덱스에 추가
//					 변수명.add(인덱스, 값) : 원하는 위치에 추가
		
		for (int i = 0 ; i < 5 ; i++) {
			arrList.add(i);
		}
		
		System.out.println("값 추가 후 ArrayList 크기 " + arrList.size());

		for(int i : arrList) {
			System.out.print(i + " ");
		}	
		
		for(int i = 0 ; i < arrList.size() ; i ++) {
			System.out.print(arrList.get(i)+ " ");
		}
		System.out.println();
//		3. 값 삭제 -> 변수명.remove(index) or 변수명.(값)
		arrList.remove(0);
		System.out.println(arrList.get(0)); //값 조회 > get(인덱스)
		System.out.println("삭제 후 arrList  크기 " +arrList.size());
		arrList.clear(); //값 모두 삭제
		System.out.println("클리어 후 arrList 크기 " + arrList.size());
		
	}

}