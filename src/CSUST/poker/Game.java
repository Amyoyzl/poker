package CSUST.poker;

public class Game {

	Poker[] pokers;

	Player[] players;

	public Game(Player[] players) {
		this.players = players;
		pokers = new Poker[52];
		for (int i = 0; i < 4; i++) {
			for (int j = 13 * i; j < 13 * (i + 1); j++) {
				pokers[j] = new Poker(i, j % 13);
			}
		}
	}

	/**
	 * 洗牌
	 */
	public void start() {
		Poker temp = new Poker();
		for (int i = 0; i < pokers.length; i++) {
			int j = (int) (Math.random() * pokers.length);
			temp = pokers[j];
			pokers[j] = pokers[0];
			pokers[0] = temp;
		}
	}

	/**
	 * 发牌
	 */
	public void divide() {
		int len = pokers.length / players.length;
		int k = 0;
		for (int i = 0; i < players.length; i++) {
			Poker[] t = new Poker[len];
			for (int j = 0; j < len; j++) {
				t[j] = pokers[k];
				k++;
			}
			players[i].setPokers(t);
		}
	}
	
	public void arrange() {
		for(Player e : players) {
			e.arrange();
		}
	}
	
	public void print() {
		for (Player e : players) {
			e.print();
		}
	}

}
