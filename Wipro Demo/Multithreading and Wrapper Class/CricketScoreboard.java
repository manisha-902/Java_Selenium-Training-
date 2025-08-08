package day7and8;
import java.util.*;
public class CricketScoreboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> playerScores = new HashMap<>();

		System.out.print("Enter number of players: ");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= n; i++) {
			System.out.print("\nEnter player name: ");
			String name = sc.nextLine();

			System.out.print("Enter runs scored by " + name + ": ");
			Integer runs = Integer.valueOf(sc.nextLine());
			playerScores.put(name, runs);
		}

		System.out.println("\n--- Match Scoreboard ---");
		int totalRuns = 0;
		for (Map.Entry<String, Integer> entry : playerScores.entrySet()) {
			System.out.println("Player: " + entry.getKey() + " Runs: " + entry.getValue());
			totalRuns += entry.getValue();
		}

		System.out.println("\nTotal Team Score: " + totalRuns);
		sc.close();
	}
}
