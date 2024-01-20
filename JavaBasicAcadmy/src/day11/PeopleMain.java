package day11;

import java.util.Scanner;

public class PeopleMain {

	public static void main(String[] args) {

		// People 이라는 설계도에 의해서 객체(Object)가 만들어지는 클래스
		// 1. 객체(사람) 생성 (클래스를 불러오는 것 : import)
		// 객체를 생성할 때 new 키워드 사용
		// 변수 앞 키워드 -> 데이터 타입(클래스)

		Scanner sc = new Scanner(System.in);
		People p = new People();
		People p1 = new People();
		People p2 = new People("Mage", 180, "남성", "Chicken");
		
		
		// p : 레퍼런스 변수 (주소가 나옴)
		// People : 생성자 메소드를 갖고 있음(보이진 않음)
		// 
		
		System.out.println(p2.favorite);
		p2.work();
		p2.talk();
		
		System.out.println("\n");
		
		p.gender = "남성";
		p.height = 230;
		p.name = "SwordMaster";
		System.out.println(p.name);
		System.out.println(p.height);
		System.out.println(p.gender);
		p.coding();
		p.talk();
		p.sleep();
		
		System.out.println("\n");
		
		
		p1.name = "Blacksmith";
		p1.height = 92.8;
		p1.gender = "Dwarf";
		p1.favorite = "Beer";
		
		System.out.println(p1.name);
		System.out.println(p1.height);
		System.out.println(p1.gender);
		System.out.println(p1.favorite);
		p1.work();
		p1.sleep();
		

		

	}

}
