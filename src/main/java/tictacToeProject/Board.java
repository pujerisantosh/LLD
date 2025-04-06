package tictacToeProject;

public class Board {
    private final int size;
    private final Cell[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j] = new Cell();
    }

    public boolean makeMove(int row, int col, Symbol symbol) {
        if (row >= size || col >= size || grid[row][col].isOccupied()) {
            return false;
        }
        grid[row][col].setSymbol(symbol);
        return true;
    }

    public boolean checkWin(Symbol symbol) {
        // check rows
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++)
                if (grid[i][j].getSymbol() != symbol) win = false;
            if (win) return true;
        }

        // check columns
        for (int i = 0; i < size; i++) {
            boolean win = true;
            for (int j = 0; j < size; j++)
                if (grid[j][i].getSymbol() != symbol) win = false;
            if (win) return true;
        }

        // diagonals
        boolean winDiag = true, winAntiDiag = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][i].getSymbol() != symbol) winDiag = false;
            if (grid[i][size - 1 - i].getSymbol() != symbol) winAntiDiag = false;
        }
        return winDiag || winAntiDiag;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (!grid[i][j].isOccupied()) return false;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Symbol s = grid[i][j].getSymbol();
                System.out.print((s != null ? s : "_") + " ");
            }
            System.out.println();
        }
    }
}
