package CSUST.poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 游戏入口
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	public static void main(String[] args) {
		// poker
		Game game = new Game();
		game.shuffle();
		game.getPoker().display();
		System.out.println();
		Card[] c1 = game.divide(3);
		Card[] c2 = game.divide(3);
		Card[] c3 = game.divide(3);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		System.out.println(Arrays.toString(c3));

		// poker2
		Poker2 poker2 = new Poker2();
		// poker2.show();
		// System.out.println();
		poker2.shuffle();
		// List<Card> list1 = poker2.cards.subList(0, 13);
		// System.out.println(list1);
		// //一下方法的前提是Card的类可比较
		// Collections.sort(list1);
		// System.out.println(list1);
		List<List<Card>> list = new ArrayList<List<Card>>();
		for (int i = 0; i < 4; i++) {
			list.add(poker2.cards.subList(i * 13, (i + 1) * 13));
			Collections.sort(list.get(i));
			System.out.println(list.get(i));
		}
	}

}
