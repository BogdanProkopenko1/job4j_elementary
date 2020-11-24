package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length - 1; i++) {
            if (board[row][i] != board[row][i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length - 1; i++) {
            if (board[i][column] != board[i + 1][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}