package bitcamp_algorithms;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon10828 {
    static Deque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());


        String[] input = new String[2];

        while (true) {
            num--;
            if(num==-1){break;}
            input = br.readLine().split(" ");

            switch (input[0]) {
                case "push":
                    push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
                case "exit":
                    return;
            }
        }
    }

    public static void push(int num) {
        stack.addFirst(num);
    }

    public static void pop() {
        Integer a = stack.pollFirst();
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

    public static void top() {
        if (!stack.isEmpty()) {
            System.out.println(stack.getFirst());
        } else {
            System.out.println(-1);
        }
    }
}
