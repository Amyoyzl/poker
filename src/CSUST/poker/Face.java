package CSUST.poker;

/**
 * 扑克牌的花色
 * 
 * @author Amy_oyzl
 *
 */
public enum Face {

	CLUBS(0, '♣'), DIAMONDS(1, '♦'), HEARTS(2, '♥'), SPADES(3, '♠');

	// clubs 梅花,三叶草
	// diamonds 方块,红方,钻石
	// hearts 红桃,红心
	// spades 黑桃,剑
	/**
	 * 花色的值
	 */
	private int index;

	/**
	 * 花色的名称
	 */
	private char name;

	/**
	 * 构造方法
	 * 
	 * @param num
	 *            花色的值
	 * @param name
	 *            花色的名称
	 */
	Face(int num, char name) {
		this.index = num;
		this.name = name;
	}

	public int getNum() {
		return index;
	}

	public char getName() {
		return name;
	}


}
