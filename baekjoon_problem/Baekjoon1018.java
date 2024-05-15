package baekjoon_problem;

import java.util.Scanner;

public class Baekjoon1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        char[][] board = new char[rows][columns];

        for (int i = 0; i < board.length; i++) {
            String input = sc.next();
            char[] arr = input.toCharArray();
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = arr[j];
            }
        }

        int count = 64;

        for (int i = 0; i < rows - 7; i++) {
            for (int j = 0; j < columns - 7; j++) {
                int k = count(board, i, j);
                count = (k < count) ? k : count;
            }
        }

        System.out.println(count);
    }


    public static int count(char[][] board, int rows, int colunms) {
        int countW = 0;
        int countB = 0;
        for (int i = rows; i < rows + 8; i++) {
            for (int j = colunms; j < colunms + 8; j++) {
                if ((i + j) % 2 == 0) {
                    if (board[i][j] != 'W') countW++;
                    if (board[i][j] != 'B') countB++;
                } else {
                    if (board[i][j] != 'B') countW++;
                    if (board[i][j] != 'W') countB++;
                }
            }
        }
        return Math.min(countW, countB);
    }
}