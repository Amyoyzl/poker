package CSUST.poker;

/**
 * 扑克牌游戏
 * 
 * @author Amy_oyzl
 *
 */
public class Poker {

	// 花色
	Face face;

	// 大小
	Number number;
	
	public Poker() {
	}
	
	public Poker(int findex, int nindex) {
		setFace(findex);
		setNumber(nindex);
	}

	/**
	 * 通过num设置花色
	 * 
	 * @param num
	 *            num = 0,花色为♣ num = 1,花色为♦ num = 2,花色为♥, num = 3,花色为♠
	 */
	public void setFace(int num) {
		switch (num) {
		case 0:
			face = Face.CLUBS;
			break;
		case 1:
			face = Face.DIAMONDS;
			break;
		case 2:
			face = Face.HEARTS;
			break;
		case 3:
			face = Face.SPADES;
			break;
		default:
			face = null;
		}
	}

	/**
	 * 通过num设置面值的名称
	 * 
	 * @param num
	 *            0对应3，1对应2，依次类推
	 */
	public void setNumber(int num) {
		switch (num) {
		case 0:
			number = Number._3;
			break;
		case 1:
			number = Number._4;
			break;
		case 2:
			number = Number._5;
			break;
		case 3:
			number = Number._6;
			break;
		case 4:
			number = Number._7;
			break;
		case 5:
			number = Number._8;
			break;
		case 6:
			number = Number._9;
			break;
		case 7:
			number = Number._10;
			break;
		case 8:
			number = Number._J;
			break;
		case 9:
			number = Number._Q;
			break;
		case 10:
			number = Number._K;
			break;
		case 11:
			number = Number._A;
			break;
		case 12:
			number = Number._2;
			break;
		default:
			face = null;
		}
	}
	
	
	public Face getFace() {
		return face;
	}

	public Number getNumber() {
		return number;
	}

	public void print() {
		System.out.printf("%c%c ",number.getName(),face.getName());
	}

}
