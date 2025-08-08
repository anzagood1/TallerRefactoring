public class RockPaperScissorsGame {
    private static final int WINS_TO_FINISH_GAME = 3;

    private final Player player1;
    private final Player player2;
    private int roundsPlayed = 0;
    private int draws = 0;

    public RockPaperScissorsGame() {
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
    }

    public void play() {
        System.out.println("--- ¡Comienza el juego de Piedra, Papel, Tijera! ---");
        System.out.println("El primero en llegar a " + WINS_TO_FINISH_GAME + " victorias gana.\n");
        while (!isGameOver()) {
            playRound();
        }
        printFinalResult();
    }

    private void playRound() {
        roundsPlayed++;
        printRoundHeader();
        Move p1Move = player1.playerChoice();
        Move p2Move = player2.playerChoice();
        printChoices(p1Move, p2Move);

        if(p1Move.beats(p2Move)) {
            player1.incrementWins();
            System.out.println(">> ¡" + player1.getName() + " gana la ronda!\n");
        } else if(p2Move.beats(p1Move)) {
            player2.incrementWins();
            System.out.println(">> ¡" + player2.getName() + " gana la ronda!\n");
        } else {
            draws++;
            System.out.println(">> ¡Esta ronda es un empate!\n");
        }
    }

    private boolean isGameOver(){
        if (player1.getWins() >= WINS_TO_FINISH_GAME) {
            return true;
        } else if (player2.getWins() >= WINS_TO_FINISH_GAME) {
            return true;
        } else {
            return false;
        }
    }

    private void printRoundHeader() {
        System.out.println("Ronda " + roundsPlayed + "!");
        System.out.println("Marcador: " + player1.getName() + ": " + player1.getWins() + " - " + player2.getName() + ": " + player2.getWins() + " (Empates: " + draws + ")");
    }
    
    private void printChoices(Move p1Move, Move p2Move) {
        System.out.println(player1.getName() + " elige: " + p1Move.getName());
        System.out.println(player2.getName() + " elige: " + p2Move.getName());
    }

    private void printFinalResult() {
        System.out.println("--- ¡Juego Terminado! ---");
        Player winner;
        if (player1.getWins() > player2.getWins()) {
            winner = player1;
        } else {
            winner = player2;
        }
        System.out.println("El ganador es " + winner.getName() + " con un marcador final de " + player1.getWins() + " a " + player2.getWins() + ".");
    }
}