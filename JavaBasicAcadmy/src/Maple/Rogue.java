package Maple;

public class Rogue extends BasicCharacter {

	@Override
	public void attack() {
		System.out.println("더블스탭");
	}

	@Override
	public void avoid() {
		System.out.println("플래시점프");
	}

	@Override
	public void move() {
		System.out.println("헤이스트");
	}

}
