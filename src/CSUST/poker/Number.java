package CSUST.poker;

/**
 * 扑克牌的面值
 * 
 * @author Amy_oyzl
 *
 */
public enum Number {

	_3(3, '3'), _4(4, '4'), _5(5, '5'), _6(6, '6'), _7(7, '7'), _8(8, '8'), _9(9, '9'), _10(10, '0'), _J(11,
			'J'), _Q(12, 'Q'), _K(13, 'K'), _A(14, 'A'), _2(15, '2');

	/**
	 * 面值的数值
	 */
	private int num;

	/**
	 * 面值的名称
	 */
	private char name;

	/**
	 * 构造方法
	 * 
	 * @param num
	 *            面值的数值
	 * @param name
	 *            面值的名称
	 */
	Number(int num, char name) {
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public char getName() {
		return name;
	}

}
