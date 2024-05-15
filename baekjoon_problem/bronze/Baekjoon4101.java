package baekjoon_problem.bronze;

import java.util.Scanner;

public class Baekjoon4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a= sc.nextInt();
            int b= sc.nextInt();

            if(a==0&&b==0){
                return;
            }else if(a>b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
