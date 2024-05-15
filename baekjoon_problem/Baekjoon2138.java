package baekjoon_problem;
//문제의 핵심 아이디어는 첫 번째 전구의 상태를 변경할지 말지 결정하는 것입니다. 첫 번째 전구의 상태를 변경하면 그 이후의 전구 상태 변경 방법이 정해지기 때문입니다. 따라서 두 가지 경우를 모두 시도해보고, 더 적은 횟수로 모든 전구를 켤 수 있는 경우를 선택합니다.

import java.util.Scanner;

public class Baekjoon2138 {
    static int n;
    static char[] original, target;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 전구의 개수
        original = sc.next().toCharArray(); // 현재 전구의 상태
        target = sc.next().toCharArray(); // 목표 전구의 상태

        int case1 = solve(false); // 첫 번째 전구를 변경하지 않는 경우
        int case2 = solve(true); // 첫 번째 전구를 변경하는 경우

        if (case1 == -1 || (case2 != -1 && case2 < case1)) {
            System.out.println(case2);
        } else {
            System.out.println(case1);
        }
    }

    static int solve(boolean changeFirst) {
        char[] bulbs = original.clone();
        int count = 0;
        if (changeFirst) {
            flip(bulbs, 0); // 첫 번째 전구의 상태를 변경
            count++;
        }
        for (int i = 1; i < n; i++) {
            if (bulbs[i - 1] != target[i - 1]) {
                flip(bulbs, i); // 현재 위치의 전구와 양 옆의 전구 상태를 변경
                count++;
            }
        }

        // 전구의 최종 상태가 목표 상태와 일치하는지 확인
        for (int i = 0; i < n; i++) {
            if (bulbs[i] != target[i]) {
                return -1; // 목표 상태를 만들 수 없는 경우
            }
        }
        return count; // 전구 상태를 목표 상태로 만드는데 필요한 최소 변경 횟수
    }

    static void flip(char[] bulbs, int index) {
        // 주어진 인덱스의 전구와 양 옆의 전구 상태를 변경
        for (int i = index - 1; i <= index + 1; i++) {
            if (i >= 0 && i < n) {
                bulbs[i] = bulbs[i] == '0' ? '1' : '0';
            }
        }
    }
}
//main 메서드: 프로그램의 진입점으로, 사용자 입력을 받고 최종 결과를 출력합니다.
//solve 메서드: 문제의 핵심 로직을 처리합니다. 입력 받은 두 문자열(원본 상태와 목표 상태)과 길이를 기반으로 최소 횟수를 계산하여 반환합니다.
//flip 메서드: 주어진 문자의 상태를 변경합니다. '0'을 '1'로, '1'을 '0'으로 바꾸는 작업을 담당합니다. 이 메서드는 solve 메서드 내에서 호출됩니다.
//이렇게 3개의 메서드로 구성하는 것이 기본적인 구조입니다. 여기서 solve 메서드는 문제 해결의 핵심 로직을 담당하며, flip 메서드는 문자 상태 변경이라는 작은 단위의 기능을 수행합니다. 이러한 분리는 코드의 가독성과 재사용성을 높여 줍니다.