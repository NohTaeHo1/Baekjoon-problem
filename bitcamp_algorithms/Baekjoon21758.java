package bitcamp_algorithms;

import java.util.Scanner;

public class Baekjoon21758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 벌통의 개수 N을 입력받습니다.
        int[] honey = new int[N];
        int[] prefixSum = new int[N+1]; // 누적 합을 저장할 배열

        for (int i = 0; i < N; i++) {
            honey[i] = sc.nextInt(); // 각 벌통에 들어있는 꿀의 양을 입력받습니다.
            prefixSum[i+1] = prefixSum[i] + honey[i]; // 누적합을 계산합니다.
        }

        int result = 0;

        // 벌 - 꿀 - 벌
        for (int i = 1; i < N-1; i++) {
            int temp = (prefixSum[N] - honey[0] - honey[i]) + (prefixSum[N] - prefixSum[i+1]);
            result = Math.max(result, temp);
        }

        // 꿀 - 벌 - 벌
        for (int i = 1; i < N; i++) {
            int temp = prefixSum[N] - honey[0] - honey[i] + (prefixSum[i] - honey[0]);
            result = Math.max(result, temp);
        }

        // 벌 - 벌 - 꿀
        for (int i = 1; i < N-1; i++) {
            int temp = prefixSum[N] - honey[N-1] - honey[i] + (prefixSum[N-1] - prefixSum[i+1]);
            result = Math.max(result, temp);
        }

        System.out.println(result); // 최대로 모을 수 있는 꿀의 양을 출력합니다.
        sc.close(); // Scanner 객체를 닫습니다.
    }
}
