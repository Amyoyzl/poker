package CSUST.poker;

/**
 * 扑克牌的花色
 * 
 * @author Amy_oyzl
 *
 */
public enum Suit {

	CLUBS('♣'), DIAMONDS('♦'), HEARTS('♥'), SPADES('♠');

	// clubs 梅花,三叶草
	// diamonds 方块,红方,钻石
	// hearts 红桃,红心
	// spades 黑桃,剑

	/**
	 * 花色的名称
	 */
	private char name;

	Suit(char name) {
		this.name = name;
	}

	public char getName() {
		return name;
	}

}
