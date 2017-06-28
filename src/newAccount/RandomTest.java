package newAccount;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min = 2500;
		int max = 7500;
		for (int i = 0; i<=50; i++) {
		System.out.println(getRandomNum(min, max));
		}
	}
	public static int getRandomNum(int min, int max) {
		int randID = (int) (Math.random()*(max - min));
		randID = randID + min;
		return randID;
	}
	
}