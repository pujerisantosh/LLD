package tictacToeProject;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Alice", Symbol.X);
        Player p2 = new Player("Bob", Symbol.O);

        TicTacToeGame game = new TicTacToeGame(p1, p2);
        game.play();
    }
}
