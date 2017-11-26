package CSUST.poker;

import java.util.ArrayList;
import java.util.Collections;

public class Poker2 {

	ArrayList<Card> cards;
	
	public Poker2() {
		cards = new ArrayList<>();
		for(Suit suit : Suit.values()) {
			for(Rank rank : Rank.values()) {
				cards.add(new Card(suit,rank));
			}
		}
	}
	
	public void show() {
		int i = 0;
		for(Card card : cards) {
			System.out.print(card.toString());
			if(i++%7==6)
				System.out.println();
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
}
