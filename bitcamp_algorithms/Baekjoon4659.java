package bitcamp_algorithms;

import java.util.Scanner;

public class Baekjoon4659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String password = scanner.next();
            if (password.equals("end")) {
                break; // 입력 종료 조건
            }
            System.out.println((isValid(password) ? "<" + password + "> is acceptable." : "<" + password + "> is not acceptable."));
        }
    }

    private static boolean isValid(String password) {
        boolean containsVowel = false; // 모음 포함 여부
        char prevChar = ' '; // 이전 문자 초기화
        int vowelCount = 0; // 연속 모음 카운트
        int consonantCount = 0; // 연속 자음 카운트

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            // 모음 체크
            if (isVowel(c)) {
                containsVowel = true;
                vowelCount++;
                consonantCount = 0;
            } else {
                vowelCount = 0;
                consonantCount++;
            }

            // 연속 3개 모음 또는 자음 체크
            if (vowelCount == 3 || consonantCount == 3) {
                return false;
            }

            // 같은 글자 연속 체크 (ee, oo 제외)
            if (c == prevChar && c != 'e' && c != 'o') {
                return false;
            }

            prevChar = c;
        }
        return containsVowel;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }
}