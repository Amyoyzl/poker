package CSUST.poker;

public class Game {

	private Poker poker;
	int mark = poker.size;

	public Game() {
		poker = new Poker();
	}

	public Poker getPoker() {
		return poker;
	}

	/**
	 * 洗牌
	 */
	public void shuffle() {
		Card[] cards = poker.getCards();
		for (int i = cards.length - 1; i >= 0; i--) {
			int r = (int) (Math.random() * i);
			Card t = cards[i];
			cards[i] = cards[r];
			cards[r] = t;
		}
	}

	public Card[] divide(int number) {
		Card[] c = new Card[number];
		for(int i = 0; i < number; i++) {
			c[i] = poker.getCards()[--mark];
		}
		return c;
	}
	
	
	

}
