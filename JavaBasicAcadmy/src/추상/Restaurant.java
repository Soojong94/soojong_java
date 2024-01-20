package 추상;

import java.util.ArrayList;

public class Restaurant {

	public static void main(String[] args) {

//		객체 생성

//		원조 짜장면집
//		Pbkjjajjang pbk = new Pbkjjajjang(); 
//		pbk.makeJjajang();

//		첫째아들 pjw 짜장면집
		Pbkjjajjang pjw = new Pjwjjajang();
		// 업캐스팅 -자식 클래스에서 객체가 생성되었으나
		// 부모 클래스 타입으로 형태가 변환된 것
		// 부모타입으로 형태가 변환되어도 부모의 메소드를 호출할 때
		// 자식 클래스에서 재정의 했다면
		// 자식 클래스의 재정의한 메소드가 호출된다
		
		//다운캐스팅 - 부모타입 객체를 자식타입으로 변환하는 것
		Pjwjjajang newPjw = (Pjwjjajang) pjw;
		Pjwjjajang newPPjw = new Pjwjjajang();
		newPjw.makeJjambong();
		newPPjw.makeJjambong();
	
		
//		둘째딸 pjy 짜장면집
		Pbkjjajjang pjy = new Pjyjjajang();
		

//		셋째아들 pdg 짜장면집
		Pbkjjajjang pdg = new Pdgjjajang();

//		조카 박현지 짜장면집
		Pbkjjajjang phj = new Phjjjajang();

		ArrayList<Pbkjjajjang> list = new ArrayList<>();
	
		list.add(pjw);
		list.add(pjy);
		list.add(pdg);
		list.add(phj);
		
		list.get(2).makeJjajang();
		System.out.println();
		
		for(Pbkjjajjang i : list) {
		i.makeJjajang();
		}
	
	}

}
