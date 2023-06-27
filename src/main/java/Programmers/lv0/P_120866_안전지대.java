package Programmers.lv0;

import java.util.Arrays;

/**
 *
 */
public class P_120866_안전지대 {
    public static int solution(int[][] board) {
        /**
         * 1. 폭탄이 네 모서리에 붙어있을 때
         * 2. 폭탄이 왼쪽 또는 오른쪽 벽에 붙어있을 때
         */
        for (int i = 0; i < board.length; i++) {
            int[] boardRow = board[i];
            for (int j = 0; j < boardRow.length; j++) {
                if(boardRow[j] == 1) {
                    // 상단 라인
                    if(i - 1 >= 0) {
                        if(j - 1 >= 0) if(board[i-1][j-1] != 1) board[i-1][j-1] = 2;
                        if(board[i-1][j] != 1) board[i-1][j] = 2;
                        if(j + 1 < boardRow.length) if(board[i-1][j+1] != 1) board[i-1][j+1] = 2;
                    }
                    // 같은 라인
                    if(j - 1 >= 0) if(board[i][j-1] != 1) board[i][j-1] = 2;
                    if(j + 1 < boardRow.length) if(board[i][j+1] != 1) board[i][j+1] = 2;
                    // 하단 라인
                    if(i + 1 < boardRow.length) {
                        if(j - 1 >= 0) if(board[i+1][j-1] != 1) board[i+1][j-1] = 2;
                        if(board[i+1][j] != 1) board[i+1][j] = 2;
                        if(j + 1 < boardRow.length) if(board[i+1][j+1] != 1) board[i+1][j+1] = 2;
                    }
                }
            }
        }

        return Arrays.stream(board)
                .mapToInt(boarRow -> (int) Arrays.stream(boarRow)
                        .filter(value -> value == 0)
                        .count())
                .sum();
    }
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] board2 = {{0, 0, 0, 0, 1}, {0, 1, 0, 1, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 1, 0, 0, 0}};
//        int result = solution(board);
        int result2 = solution(board2);
//        System.out.println(result);
        System.out.println(result2);
    }
}
