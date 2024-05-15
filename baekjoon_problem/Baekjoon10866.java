package baekjoon_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon10866 {
    static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] input = new String[2];

        while (num==0) {
            num--;

            input = br.readLine().split(" ");

            switch (input[0]) {
                case "push_front":
                    push_front(Integer.parseInt(input[1]));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
    }

    public static void push_front(int num) {
        stack.addFirst(num);
    }

    public static void push_back(int num) {
        stack.addLast(num);
    }

    public static void pop_front() {
        Integer a = stack.pollFirst();
        int b = (a == null) ? -1 : a;
        System.out.println(b);
    }

    public static void pop_back() {
        Integer a = stack.pollLast();
        int b = (a == null) ? -1 : a;
        System.out.println(b);
    }

    public static void size() {
        System.out.println(stack.size());
    }

    public static void empty() {
        int a = (stack.size() == 0) ? 1 : 0;
        System.out.println(a);
    }

    public static void front(){
        System.out.println((stack.isEmpty())?-1:stack.peekFirst());
    }

    public static void back(){
        System.out.println((stack.isEmpty())?-1:stack.peekLast());
    }
}
