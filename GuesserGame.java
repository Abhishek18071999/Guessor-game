import java.util.Scanner;

class Guesser {
    int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int guessNum = scan.nextInt();
        return guessNum;
    }
}

class Player {
    private int playerNo;

    Player(int playerNo) {
        this.playerNo = playerNo;
    }

    int guessNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for Player " + playerNo + ":");
        int guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire {
    int guessNum;
    int guessNumOfPlayer1;
    int guessNumOfPlayer2;
    int guessNumOfPlayer3;

    void collectNumForGuesser() {
        Guesser guesser = new Guesser();
        guessNum = guesser.guessNumber();
    }

    void collectNumForPlayers() {
        Player player1 = new Player(1);
        Player player2 = new Player(2);
        Player player3 = new Player(3);
        guessNumOfPlayer1 = player1.guessNumber();
        guessNumOfPlayer2 = player2.guessNumber();
        guessNumOfPlayer3 = player3.guessNumber();
    }

    void compare() {
        if (guessNum == guessNumOfPlayer1) {
            System.out.println("Player 1 is the winner!");
        } else if (guessNum == guessNumOfPlayer2) {
            System.out.println("Player 2 is the winner!");
        } else if (guessNum == guessNumOfPlayer3) {
            System.out.println("Player 3 is the winner!");
        } else {
            System.out.println("No one has won.");
        }
    }
}

public class GuessorGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.collectNumForGuesser();
        umpire.collectNumForPlayers();
        umpire.compare();
    }
}
