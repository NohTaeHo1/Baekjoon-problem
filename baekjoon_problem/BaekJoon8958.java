package baekjoon_problem;

import java.util.Scanner;

public class BaekJoon8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testNumber = sc.nextInt();
        int[] finalScore = new int[testNumber];

        for (int i = 0; i < testNumber; i++) {
            String input = sc.next();
            char[] arrayInput = input.toCharArray();
            int total = 0;
            int score = 1;
            for (int j = 0; j < arrayInput.length; j++) {
                if (arrayInput[j] == 'O') {
                    total += score;
                    score++;
                } else {
                    score = 1;
                }
            }
            finalScore[i] = total;
        }
        for (int i : finalScore) {
            System.out.println(i);
        }
    }
}