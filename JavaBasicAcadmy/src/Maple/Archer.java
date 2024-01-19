package Maple;

public class Archer extends BasicCharacter {

	@Override
	public void attack() {
		System.out.println("폭풍의시");
	}

	@Override
	public void avoid() {
		System.out.println("넉백");
	}

	@Override
	public void move() {
		System.out.println("밑점프");
	}

}
