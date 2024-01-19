package Maple;

public class Magician extends BasicCharacter {

	@Override
	public void attack() {
		System.out.println("에너지볼트");
	}

	@Override
	public void avoid() {
		System.out.println("마나실드");

	}

	@Override
	public void move() {
		System.out.println("텔레포트");
	}

}
