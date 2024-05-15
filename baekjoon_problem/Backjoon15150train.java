package baekjoon_problem;

import java.util.Scanner;

public class Backjoon15150train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passenger = 0;
        int max = 0;

        for (int i=0;i<10;i++){
            int plus = -sc.nextInt()+ sc.nextInt();
            passenger +=plus;

            if(max<passenger){
                max = passenger;
            }
        }
        System.out.print(max);
    }
}
