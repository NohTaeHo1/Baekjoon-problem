package baekjoon_problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<testCase;i++){
            int input = sc.nextInt();
            map.put(input, input);
        }

        int findCase = sc.nextInt();
        int[] ans = new int[findCase];

        for(int i=0;i<findCase;i++){
            int input = sc.nextInt();
            ans[i] = (map.get(input)!=null)?1:0;
        }

        Arrays.stream(ans).forEach(System.out::println);
    }
}
