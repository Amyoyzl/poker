package CSUST.poker;

/**
 * 扑克牌游戏
 * 
 * @author Amy_oyzl
 *
 */
public class Card {

	// 花色
	Suit suit;

	// 大小
	Rank rank;

	/**
	 * @param suit
	 * @param rank
	 */
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return String.format("%2s%c ", rank.getName(), suit.getName());
	}

}
