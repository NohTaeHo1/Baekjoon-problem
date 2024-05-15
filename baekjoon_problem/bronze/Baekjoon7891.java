package baekjoon_problem.bronze;

import java.util.Scanner;

public class Baekjoon7891 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();

        for(int i =0;i<testCase;i++){
            int sum = sc.nextInt()+sc.nextInt();
            System.out.println(sum);
        }
    }
}
