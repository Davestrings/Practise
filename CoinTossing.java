package Practise;
import java.util.Random;

public class CoinTossing {
	private static enum coin{HEAD, TAIL};
	private static int frequencyHead;
	private static int frequencyTail;
	
	static Random rand = new Random();
	
	public static int flipCoin() {
		int coinVal = 1 + rand.nextInt(2);
		return coinVal;
	}
	public static int countFrequency() {
		frequencyHead = 0;
		frequencyTail = 0;
		if(flipCoin() ==1) {
			return frequencyHead += 1;
		}else {
			return frequencyTail += 1;
		}
	}
	public static Enum displayCoin() {
//		coinVal = flipCoin();
		if(flipCoin()== 1) {
			return coin.HEAD;
		}else {
			return coin.TAIL;
		}
		
	}
	public static void displayFrequency() {
		System.out.printf("Number of count is %d", countFrequency());
	}
	
}
