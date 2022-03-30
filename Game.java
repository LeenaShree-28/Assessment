import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
	public void playGame() {
		HashMap<Integer, String> hMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any four numbers :");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		System.out.println("Enter the result number :");
		int result = scanner.nextInt();
		int clubFour = Integer.parseInt(Integer.toString(num1).concat(Integer.toString(num2)).concat(Integer.toString(num3)).concat(Integer.toString(num4)));
		String ansClubFour = Integer.toString(clubFour);
		hMap.put(clubFour, ansClubFour);
		int plusClubThree = num1 + Integer.parseInt(Integer.toString(num2).concat(Integer.toString(num3)).concat(Integer.toString(num4)));
		String ansPlusClubThree = num1 + " + " + Integer.parseInt(Integer.toString(num2).concat(Integer.toString(num3)).concat(Integer.toString(num4)));
		hMap.put(plusClubThree, ansPlusClubThree);
		int minusClubThree = num1 - Integer.parseInt(Integer.toString(num2).concat(Integer.toString(num3)).concat(Integer.toString(num4)));
		String ansminusClubThree = num1 + " - " + Integer.parseInt(Integer.toString(num2).concat(Integer.toString(num3)).concat(Integer.toString(num4)));
		hMap.put(minusClubThree, ansminusClubThree);
		for (Map.Entry check : hMap.entrySet()) {
			if (check.getKey().equals(result)) {
				System.out.println("Answer : \n" + check.getValue());
			}
		}
		scanner.close();
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.playGame();
	}
}