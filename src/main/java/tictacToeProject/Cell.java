package tictacToeProject;

import lombok.Getter;

public class Cell {

    @Getter
    private Symbol symbol;
    private boolean isOccupied;

    public Cell() {
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
        this.isOccupied = true;
    }

}
