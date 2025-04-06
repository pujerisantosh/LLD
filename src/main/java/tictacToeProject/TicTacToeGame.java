package tictacToeProject;
import java.util.Scanner;

public class TicTacToeGame {
    private Board board;
    private Player[] players;
    private int currentPlayerIdx;

    public TicTacToeGame(Player p1, Player p2) {
        this.board = new Board(3);  // 3x3 board
        this.players = new Player[]{p1, p2};
        this.currentPlayerIdx = 0;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        GameStatus status = GameStatus.IN_PROGRESS;

        while (status == GameStatus.IN_PROGRESS) {
            board.printBoard();
            Player current = players[currentPlayerIdx];
            System.out.println(current.getPlayerName() + "'s turn (" + current.getSymbol() + "). Enter row and column:");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!board.makeMove(row, col, current.getSymbol())) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            if (board.checkWin(current.getSymbol())) {
                status = GameStatus.WIN;
                board.printBoard();
                System.out.println(current.getPlayerName() + " wins!");
                break;
            }

            if (board.isFull()) {
                status = GameStatus.DRAW;
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayerIdx = 1 - currentPlayerIdx;  // Switch turns
        }

        scanner.close();
    }
}
