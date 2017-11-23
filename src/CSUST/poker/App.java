package CSUST.poker;

import java.util.Arrays;

/**
 * 游戏入口
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	public static void main(String[] args) {
		
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
		
	}

}
