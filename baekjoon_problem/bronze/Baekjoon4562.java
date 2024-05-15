package baekjoon_problem.bronze;

import java.util.Scanner;

public class Baekjoon4562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        for(int i=0;i<testCase;i++){
            System.out.println((sc.nextInt()<sc.nextInt())?"NO BRAINS":"MMM BRAINS");

        }
    }
}
