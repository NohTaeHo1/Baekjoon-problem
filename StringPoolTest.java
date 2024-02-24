import java.util.Scanner;

public class StringPoolTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.printf("str1 : %s 그리고 ", str1);
        System.out.printf("str2 : %s\n", str2);
        System.out.printf("str1과 str2는 : ");

        if (str1 == str2){
            System.out.println("동일 객체 참조");
        }
        else {
            System.out.println("다른 객체 참조");
        }
        System.out.println("");

        String str3 = "Hello";
        String str4 = new String("Hello");

        System.out.printf("str3 : %s 그리고 ", str3);
        System.out.printf("str4 : %s\n", str4);
        System.out.printf("str3과 str4는 : ");

        if (str3 == str4){
            System.out.println("동일 객체 참조");
        }
        else {
            System.out.println("다른 객체 참조");
        }
    }
}
