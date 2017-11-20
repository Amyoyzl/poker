package CSUST.poker;

public class Player {

	private String name;
	private Poker[] pokers;

	public Player(String name) {
		this.name = name;
	}

	public Poker[] getPokers() {
		return pokers;
	}

	public void setPokers(Poker[] pokers) {
		this.pokers = pokers;
	}

	public String getName() {
		return name;
	}

	/**
	 * 理牌
	 */
	public void arrange() {
		for (int i = 0; i < pokers.length; i++) {
			Poker min = pokers[i];
			int minIndex = i;
			for (int j = i + 1; j < pokers.length; j++) {
				if(min.getNumber().getNum() > pokers[j].getNumber().getNum()) {
					min = pokers[j];
					minIndex = j;
				}
			}
			pokers[minIndex] = pokers[i];
			pokers[i] = min;
		}
	}

	public void print() {
		System.out.println(name + "的牌:");
		for (Poker e : pokers) {
			e.print();
		}
		System.out.println();
	}

}
