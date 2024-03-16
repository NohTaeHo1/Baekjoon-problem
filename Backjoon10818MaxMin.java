import java.util.Arrays;
import java.util.Scanner;

public class Backjoon10818MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }


//        System.out.print(Arrays.stream(numbers).min().getAsInt());
//        System.out.print(" ");
//        System.out.print(Arrays.stream(numbers).max().getAsInt());

    }
}
