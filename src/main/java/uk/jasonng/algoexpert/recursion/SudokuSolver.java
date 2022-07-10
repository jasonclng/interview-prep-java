package uk.jasonng.algoexpert.recursion;

import java.util.Arrays;
import java.util.Stack;

public class SudokuSolver {
    private static int CELLS = 9;
    private int[][] board;

    public int[][] solveSudoku(int[][] board) {
        // Write your code here.
        int row = 0, column = 0;
        Stack<int[]> stack = new Stack<>();

        this.board = Arrays.stream(board).map(int[]::clone).toArray(int[][]::new);
        while (row < CELLS) {
            while (column < CELLS) {
                if (isEmpty(row, column)) {
                    stack.add(new int[]{row, column});

                    int[] element;
                    int r, c, d = 0;
                    do {
                        element = stack.peek();
                        r = element[0];
                        c = element[1];
                        d = ++this.board[r][c];
                        while (this.board[r][c] < CELLS + 1) {
                            if (isDigitValid(r, c, this.board[r][c])) {
                                break;
                            }
                            d = ++this.board[r][c];
                        }
                        if (this.board[r][c] == CELLS + 1) {
                            this.board[r][c] = 0;
                            stack.pop();
                        }
                    } while (d == 10);
                    row = r;
                    column = c;
                }
                column++;
            }
            row++;
            column = 0;
        }

        return this.board;
    }

    private boolean isEmpty(int i, int j) {
        return board[i][j] == 0;
    }

    private boolean isDigitValid(int row, int column, int digit) {
        if (isDigitValidInRow(row, column, digit)
                && isDigitValidInColumn(row, column, digit)
                && isDigitValidInBox(row, column, digit)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isDigitValidInRow(int row, int column, int digit) {
        for (int i = 0; i < CELLS; i++) {
            if (i != column && board[row][i] == digit) {
                return false;
            }
        }

        return true;
    }

    private boolean isDigitValidInColumn(int row, int column, int digit) {
        for (int i = 0; i < CELLS; i++) {
            if (i != row && board[i][column] == digit) {
                return false;
            }
        }

        return true;
    }

    private boolean isDigitValidInBox(int row, int column, int digit) {
        int rowOffset = row / 3, columnOffset = column / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int r = rowOffset * 3 + i, c = columnOffset * 3 + j;
                if (!(r == row && c == column)
                        && board[r][c] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}