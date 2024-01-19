package Maple;

public abstract class BasicCharacter {

	// 기본 캐릭터
	// 체력 , 마력, 경험치, 공격, 회피, 이동

	int hp;
	int mp;
	int exp;

	public abstract void attack();

	public abstract void avoid();

	public abstract void move();

}
