import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double test = 1234.56789;
//        System.out.printf("%2.3f", test);

        ArrayList<Integer> test = new ArrayList<>();
        test.addAll(Arrays.asList(0, 1, 234, 3));

        System.out.println(test.size());

        ArrayList<String> test2 = new ArrayList<>();
        test2.add("0");
        test2.add("1");
        test2.add("234");
        test2.add("3");


        System.out.println(test2.remove("234")); //true 예상
        System.out.println(test.remove(2)); //234 예상

        System.out.println(test.remove(Integer.valueOf(234))); //false 예상
        System.out.println(test);

        String[] test3 = {"월", "화"};
        System.out.println(test3);
        System.out.println(Arrays.toString(test3));

        ArrayList<String> test4 = new ArrayList<>(Arrays.asList("1","2","3"));
        System.out.println(String.join("~", test4));



    }
}
