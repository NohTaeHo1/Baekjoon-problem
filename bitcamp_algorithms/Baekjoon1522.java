package bitcamp_algorithms;

import java.util.Scanner;

public class Baekjoon1522 {
    public static void main(String[] args) {
        // 'A'의 개수만큼의 창(window)을 만들어 창 안에 'B'가 최소가 되도록 이동시키는 방식을 생각할 수 있습니다.
        //문자열의 길이와 'A'의 개수를 기반으로 한 창(window)을 이동시키면서, 창 안에 있는 'B'의 개수를 최소화
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next(); // 입력 문자열 받기
        int length = input.length();

        int totalA = 0; // 전체 'A'의 개수
        for(int i = 0; i < length; i++) {
            if(input.charAt(i) == 'A') totalA++;
        }

        int currentB = 0; // 현재 창(window) 안의 'B'의 개수
        for(int i = 0; i < totalA; i++) {
            if(input.charAt(i) == 'B') currentB++;
        }

        int minB = currentB; // 최소 'B'의 개수를 찾기 위한 변수
        for(int i = 1; i <= length - totalA; i++) {
            if(input.charAt(i - 1) == 'B') currentB--; // 창을 이동시키며, 나가는 문자가 'B'이면 'B'의 개수 감소
            if(input.charAt(i + totalA - 1) == 'B') currentB++; // 창에 들어오는 문자가 'B'이면 'B'의 개수 증가

            minB = Math.min(minB, currentB); // 최소 'B' 개수 갱신
        }

        System.out.println(minB); // 결과 출력
    }
}
