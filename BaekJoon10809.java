import java.util.Scanner;

public class BaekJoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] arrayInput = input.toCharArray();

        for (char i = 'a';i<='z';i++){
            for(int j=0;j< arrayInput.length;j++){
                if(i==arrayInput[j]){
                    System.out.print(j+" ");
                    break;
                }
                else if(j== arrayInput.length-1){
                    System.out.print("-1 ");
                }
            }
        }
    }
}
