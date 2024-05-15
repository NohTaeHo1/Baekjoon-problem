package baekjoon_problem;

import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[10];

        for(int i=0;i< input.length;i++){
            input[i] = sc.nextInt();
        }

        HashSet<Integer> answer = new HashSet<>();
        for(int i:input){
            int rest = i%42;
            answer.add(rest);
        }

        System.out.println(answer.size());
    }
}
