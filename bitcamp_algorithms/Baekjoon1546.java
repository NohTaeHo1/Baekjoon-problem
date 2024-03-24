package bitcamp_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] score = new double[n];
        double sum = 0;
        for(int i=0;i<score.length;i++){
            score[i] = sc.nextInt();
            sum += score[i];
        }
        Arrays.sort(score);

        System.out.println((sum/n)/score[n-1]*100);
    }
}
