package Maple;

public class Warrior extends BasicCharacter {


	@Override
	public void attack() {
		System.out.println("파워슬래시");
	}

	@Override
	public void avoid() {
		System.out.println("방패로 막기!");
	}

	@Override
	public void move() {
		System.out.println("빠른 걸음으로 이동!");
	}

}
