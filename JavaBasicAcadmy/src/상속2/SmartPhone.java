package 상속2;

public class SmartPhone extends Phone {

	public void playMusic() {
		System.out.println("음악재생");

	}

	public void interNet() {
		System.out.println("데이터 무제한 접속");
	}

	@Override
	public void call() {

		super.call();
		System.out.println("전화 그만");
	}

	@Override
	public void callBack() {

		super.callBack();
		System.out.println("안 받을랭");
	}

	// 데이터 오버라이딩된 메소드가 X(메소드가 다름)

//	public void call(int a) {
//		System.out.println("전화 좀 그만해");
//	}

//	@Override //어노테이션 : 기능을 하는 주석

//	public void call() {
//		System.out.println("상속 받은 콜");
//	}

}
