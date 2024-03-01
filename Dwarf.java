import java.util.Arrays;
import java.util.Scanner;
public class Dwarf{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dwarf = new int[9];
        int total = 0;

        for(int i=0;i<dwarf.length;i++){
            dwarf[i] = sc.nextInt();
            total += dwarf[i];
        }

        for(int i=0;i< dwarf.length;i++){
            for (int j=0;j<i;j++){
                if(total - dwarf[i] - dwarf[j]==100){
                    dwarf[i] = 0;
                    dwarf[j]= 0;
                }
            }
        }

        //Arrays.sort(dwarf);

        for (int i=0;i<dwarf.length-1;i++){
            for (int j=0;j< dwarf.length-1;j++){
                if(dwarf[j]>dwarf[j+1]){
                    int space = dwarf[j];
                    dwarf[j] = dwarf[j+1];
                    dwarf[j+1] = space;
                }
            }
        }

        for(int i=2;i<dwarf.length;i++){
            System.out.println(dwarf[i]);
        }

        /*
        Arrays.sort(dwarf);

        loop:
        for(int i=0;i<dwarf.length;i++){
            for(int j=i+1;j< dwarf.length;j++){
                if(total-dwarf[i]-dwarf[j]==100){
                    for(int k=0;k< dwarf.length;k++){
                        if(k==i||k==j){

                        }else{
                            System.out.println(dwarf[k]);
                        }
                    }
                    break loop;
                }
            }
        }*/
    }
}