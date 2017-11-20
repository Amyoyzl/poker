package CSUST.poker;


/**
 * 
 * @author Amy_oyzl
 *
 */
public class App {

	public static void main(String[] args) {
		
		// 创建玩家
		Player[] players = new Player[4];
		players[0] = new Player("alice");
		players[1] = new Player("jack");
		players[2] = new Player("rose");
		players[3] = new Player("bob");
		//创建游戏
		Game g = new Game(players);
		//洗牌
		g.start();
		//发牌
		g.divide();
		//玩家理牌
		g.arrange();
		//理牌结果
		g.print();
	}

}
