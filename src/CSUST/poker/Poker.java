package CSUST.poker;

public class Poker {

	public static final int size = 52;
	
	/**
	 * 一副扑克牌
	 */
	private Card[] cards = new Card[size];

	public Poker() {
		int k = 0;
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				cards[k++] = new Card(s, r);
			}
		}
		// Collections.shuffle(list);
	}

	public Card[] getCards() {
		return cards;
	}


	public void display() {
		int c = 0;
		for (Card e : cards) {
			System.out.print(e.toString());
			if (c++ % 7 == 6)
				System.out.println();
		}
		System.out.println();
	}

}
