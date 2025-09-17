package string;

import java.util.*;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "draw";
        } else if ((user.equals("rock") && computer.equals("scissors")) ||
                   (user.equals("paper") && computer.equals("rock")) ||
                   (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        } else {
            return "computer";
        }
    }

    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        double userWinPercentage = (userWins * 100.0) / totalGames;
        double computerWinPercentage = (computerWins * 100.0) / totalGames;
        double drawPercentage = (draws * 100.0) / totalGames;

        String[][] stats = {
            {"Player Wins", String.valueOf(userWins), String.format("%.2f%%", userWinPercentage)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerWinPercentage)},
            {"Draws", String.valueOf(draws), String.format("%.2f%%", drawPercentage)}
        };
        return stats;
    }

    public static void displayResults(List<String[]> gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.printf("%-10s %-15s %-15s %-10s%n", "Game", "Player Choice", "Computer Choice", "Winner");
        int gameNumber = 1;
        for (String[] result : gameResults) {
            System.out.printf("%-10d %-15s %-15s %-10s%n", gameNumber++, result[0], result[1], result[2]);
        }

        System.out.println("\nOverall Stats:");
        System.out.printf("%-15s %-10s %-10s%n", "Category", "Wins", "Percentage");
        for (String[] row : stats) {
            System.out.printf("%-15s %-10s %-10s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        int userWins = 0, computerWins = 0, draws = 0;
        List<String[]> gameResults = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;
            else draws++;
            gameResults.add(new String[]{userChoice, computerChoice, winner});
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, n);
        displayResults(gameResults, stats);
        sc.close();
    }
}
