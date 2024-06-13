import java.util.Scanner;

public class ElectionResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidates = new String[5];
        int[] votes = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter candidate name: ");
            candidates[i] = scanner.nextLine();
            System.out.print("Enter number of votes received by " + candidates[i] + ": ");
            votes[i] = scanner.nextInt();
            scanner.nextLine(); 
        }

        int totalVotes = 0;
        for (int vote : votes) {
            totalVotes += vote;
        }

        System.out.println("\nCandidate Name\tVotes Received\tPercentage of Total Votes Received");
        for (int i = 0; i < 5; i++) {
            double percentage = (double) votes[i] / totalVotes * 100;
            System.out.printf("%-15s\t%d\t\t%.2f%%\n", candidates[i], votes[i], percentage);
        }

        int maxVotes = votes[0];
        String winner = candidates[0];
        for (int i = 1; i < 5; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winner = candidates[i];
            }
        }

        System.out.println("\nThe Winner Candidate name is: " + winner);

        scanner.close();
        System.out.println("\n");
        System.out.println("********************************************************************");
        System.out.println("Implemented by : Priyanshu Thapliyal \tBtech CSE\tA2\t 46");
        System.out.println("********************************************************************");
        System.out.println("\n");
    }
}

