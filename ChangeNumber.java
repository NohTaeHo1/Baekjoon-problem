import java.util.Scanner;

public class ChangeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {500, 100, 50, 10, 5, 1};
        int count = 0;
        int price = sc.nextInt();
        int change = 1000 - price;

        for (int coin : arr) {
            count += change / coin;
            change %= coin;
        }
        System.out.println(count);
    }
}

