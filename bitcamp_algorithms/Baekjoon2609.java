package bitcamp_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = {sc.nextInt(), sc.nextInt()};

        Arrays.sort(input);

        int maxDivisor = 0;
        for(int i=input[0];i>0;i--){
            if(input[0]%i+input[1]%i==0){
                maxDivisor = i;
                break;
            }
        }

        int minMultiple = 0;
        for(int i=input[1];true;i++){
            if(i%input[0]+i%input[1]==0) {
                minMultiple = i;
                break;
            }
        }

        System.out.println(maxDivisor+"\n"+minMultiple);
    }
}
