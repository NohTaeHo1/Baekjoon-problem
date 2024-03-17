import java.util.Scanner;

public class Baekjoon2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[8];

        for (int i = 0; i < input.length; i++) {
            input[i] = sc.nextInt();
        }

        if (input[0] + 1 == input[1]) {
            for (int i = 1; i < 7; i++) {
                if (input[i] + 1 == input[i + 1]) {
                    if (i == 6) {
                        System.out.println("ascending");
                        return;
                    }
                } else {
                    System.out.println("mixed");
                    return;
                }
            }
        } else if (input[0] - 1 == input[1]) {
            for (int i = 1; i < 7; i++) {
                if (input[i] - 1 == input[i + 1]) {
                    if (i == 6) {
                        System.out.println("descending");
                        return;
                    }
                } else {
                    System.out.println("mixed");
                    return;
                }
            }
        }
        System.out.println("mixed");
    }
}
