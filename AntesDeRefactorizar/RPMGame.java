/* S1mulate a game of Rock, Paper, Scissors */

public class RPMGame {
    public static void main(String args[]) {
        Player p1 = new Player();
        Player p2 = new Player();
        boolean gameon = false;
        int roundsPlayed = 0;    // Number of rounds played
        int p1Wins = p1.wins;
        int p2Wins = p2.wins;
        int draw = 0;
        String p1choice;
        String p2choice;
        // Game Loop
        do {
            System.out.println("****** Round: " + 
                roundsPlayed + " ******\n");
            System.out.println("Number of Draws: " + 
                draw + "\n");
            p1choice = p1.playerChoice();
            System.out.println("Player 1: " + p1choice +
                "\t Player 1 Total Wins: " + p1Wins);
            p2choice = p2.playerChoice();
            System.out.println("Player 2: " + p2choice +
                "\t Player 2 Total Wins: " + p2Wins);
            if((p1choice.equals("rock")) && (p2choice.equals("paper"))) {
                System.out.println("Player 2 Wins");
                p2Wins++; // trying a couple different ways to get count to work
            } else if((p1choice.equals("paper")) && (p2choice.equals("rock"))) {
                p1Wins++;
                System.out.println("Player 1 Wins");
            } else if((p1choice.equals("rock")) && (p2choice.equals("scissors"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if((p1choice.equals("scissors")) && (p2choice.equals("rock"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            } else if((p1choice.equals("scissors")) && (p2choice.equals("paper"))) {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            } else if((p1choice.equals("paper")) && (p2choice.equals("scissors"))) {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            }

            if(p1choice==p2choice) {
                draw++;
                System.out.println("\n\t\t\t Draw \n");
            }
            
            roundsPlayed++;
            if((p1.getWins()>=3) || (p2.getWins()>=3)) {
                gameon = true;
                System.out.println("GAME WON");
            }
            System.out.println();
        } while(gameon != true);
    }
}
