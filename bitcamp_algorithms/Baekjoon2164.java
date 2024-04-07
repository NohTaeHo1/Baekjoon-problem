package bitcamp_algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        List<Integer> card = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            card.add(i+1);
        }

        while(card.size()!=1){
            card.remove(0);

            int i = card.get(0);
            card.remove(0);
            card.add(i);
        }
        System.out.println(card.get(0));
    }
}

//        int testCase = sc.nextInt();
//        Deque<Integer> card = new ArrayDeque<>();
//
//        for (int i = 1; i <= testCase; i++) {
//            card.add(i);
//        }
//
//        while(card.size() != 1) {
//            card.poll(); // 맨 앞의 원소를 제거
//            card.add(card.poll()); // 그 다음 맨 앞의 원소를 제거하고 바로 맨 뒤로 추가
//        }
//        System.out.println(card.peek()); // 남은 하나의 원소를 출력
//int testCase = sc.nextInt();
//Queue<Integer> card = new LinkedList<>();
//
//        for (int i = 1; i <= testCase; i++) {
//        card.offer(i); // 맨 뒤에 요소를 추가한다.
//        }
//
//                while (card.size() != 1) {
//        card.poll(); // 맨 앞의 원소를 제거한다.
//            card.offer(card.poll()); // 그 다음 맨 앞의 원소를 제거한 후 맨 뒤로 추가한다.
//        }
//
//        System.out.println(card.peek()); // 남은 하나의 원소를 출력한다.