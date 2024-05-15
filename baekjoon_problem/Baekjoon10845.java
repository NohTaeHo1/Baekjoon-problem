package baekjoon_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Baekjoon10845 {
    static Queue<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());

        while (testCase != 0) {
            testCase--;
            String[] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    push(input[1]);
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
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
    }

    public static void push(String input){
        queue.add(Integer.parseInt(input));
    }

    public static void pop(){
        int a = (queue.isEmpty())?-1:queue.remove();
        System.out.println(a);
    }

    public static void size(){
        System.out.println(queue.size());
    }

    public static void empty(){
        int a = (queue.isEmpty())?1:0;
        System.out.println(a);
    }

    public static void front(){
        int a = (queue.isEmpty())?-1:queue.element();
        System.out.println(a);
    }

    public static void back(){
        int a = (queue.isEmpty())?-1:((ArrayDeque<Integer>) queue).getLast();
        System.out.println(a);
    }
}
