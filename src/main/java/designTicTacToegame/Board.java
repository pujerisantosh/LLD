package designTicTacToegame;

public class Board {

    private int size;
    private char[][] grid;

    public Board(int size) {
        this.size = size;
        grid = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean makeMove(int row, int col, char symbol) {
        if (row < 0 || col < 0 || row >= size || col >= size || grid[row][col] != '-') {
            return false;
        }
        grid[row][col] = symbol;
        return true;
    }

    public boolean checkWin(int row, int col, char symbol) {
        boolean winRow = true, winCol = true, winDiag = true, winAntiDiag = true;

        // Check row
        for (int i = 0; i < size; i++) {
            if (grid[row][i] != symbol) {
                winRow = false;
                break;
            }
        }

        // Check column
        for (int i = 0; i < size; i++) {
            if (grid[i][col] != symbol) {
                winCol = false;
                break;
            }
        }

        // Check main diagonal
        if (row == col) {
            for (int i = 0; i < size; i++) {
                if (grid[i][i] != symbol) {
                    winDiag = false;
                    break;
                }
            }
        } else {
            winDiag = false;
        }

        // Check anti-diagonal
        if (row + col == size - 1) {
            for (int i = 0; i < size; i++) {
                if (grid[i][size - i - 1] != symbol) {
                    winAntiDiag = false;
                    break;
                }
            }
        } else {
            winAntiDiag = false;
        }

        return winRow || winCol || winDiag || winAntiDiag;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}