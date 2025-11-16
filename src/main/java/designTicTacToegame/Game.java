package designTicTacToegame;

import java.util.Scanner;

public class Game {

    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Player p1, Player p2, int size) {
        this.board = new Board(size);
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = p1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        boolean gameEnded = false;

        while (!gameEnded) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + " (" + currentPlayer.getSymbol() + ") turn.");
            System.out.print("Enter row and column (0-based): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!board.makeMove(row, col, currentPlayer.getSymbol())) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (board.checkWin(row, col, currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                gameEnded = true;
            } else if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                gameEnded = true;
            } else {
                switchPlayer();
            }
        }
        sc.close();
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }
}
