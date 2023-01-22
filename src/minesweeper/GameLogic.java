package minesweeper;

public class GameLogic {
    private boolean[][] mines;
    private boolean[][] revealed;
    private int rows;
    private int cols;
    private int minesCount;
    private boolean gameOver;

    public GameLogic(int rows, int cols, int minesCount) {
        this.rows = rows;
        this.cols = cols;
        this.minesCount = minesCount;
        this.gameOver = false;
        this.mines = new boolean[rows][cols];
        this.revealed = new boolean[rows][cols];
        placeMines();
    }
    // Placing mines randomly
    private void placeMines() {
        int minesPlaced = 0;
        while (minesPlaced < minesCount) {
            int row = (int)(Math.random() * rows);
            int col = (int)(Math.random() * cols);
            if (!mines[row][col]) {
                mines[row][col] = true;
                minesPlaced++;
            }
        }
    }
    // return number of mines around a cell
    public int adjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < cols) {
                    if (mines[i][j]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void reveal(int row, int col) {
        if (gameOver || revealed[row][col]) {
            return;
        }
        if (mines[row][col]) {
            gameOver = true;
        } else {
            revealed[row][col] = true;
        }
    }

    public boolean isRevealed(int row, int col) {
        return revealed[row][col];
    }

    public boolean isMine(int row, int col) {
        return mines[row][col];
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

}
