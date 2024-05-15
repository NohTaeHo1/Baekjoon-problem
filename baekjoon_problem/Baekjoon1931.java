package baekjoon_problem;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1931 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            meetings[i][0] = scanner.nextInt(); // 시작 시간
            meetings[i][1] = scanner.nextInt(); // 끝나는 시간
        }

        // 회의를 끝나는 시간, 그리고 시작 시간 순으로 정렬
        Arrays.sort(meetings, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int count = 0;
        int prevEnd = 0;

        for (int[] meeting : meetings) {
            if (meeting[0] >= prevEnd) { // 이전 회의가 끝난 시간 이후에 시작하면
                prevEnd = meeting[1]; // 이 회의의 끝나는 시간을 기록
                count++; // 회의 수 증가
            }
        }

        System.out.println(count); // 최대 사용할 수 있는 회의의 개수 출력
    }
}