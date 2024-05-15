package baekjoon_problem;

import java.util.Scanner;

public class Backjoon18108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lunarClendar = sc.nextInt();
        int difference = 2541-1998;

        System.out.println(lunarClendar-difference);
    }
}
