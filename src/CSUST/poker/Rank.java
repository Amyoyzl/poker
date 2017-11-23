package CSUST.poker;

/**
 * 扑克牌的面值
 * 
 * @author Amy_oyzl
 *
 */
public enum Rank {

	THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), 
	SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"), 
	NINE(9, "9"), TEN(10, "10"), JACK(11, "J"), 
	QUEEN(12, "Q"), KING(13, "K"), ACE(14, "A"), 
	DEUCE(15, "2");

	/**
	 * 面值的数值
	 */
	private int num;

	/**
	 * 面值的名称
	 */
	private String name;

	/**
	 * 构造方法
	 * 
	 * @param num
	 *            面值的数值
	 * @param name
	 *            面值的名称
	 */
	Rank(int num, String name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

}
