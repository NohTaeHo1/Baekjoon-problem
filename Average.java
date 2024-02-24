import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //사용자로부터 학생수만큼 학생들의 이름과 영어 수학 성적을 입력받아, 평균 성적을 계산하고, 가장 높은 평균 성적을 가진 학생의 이름과 성적 출력

        System.out.printf("학생 수: ");
        int num = sc.nextInt();
        String[] name = new String[num];
        int[] ave = new int[num];

        String nameMax = "";
        int aveMax = 0;

        for (int i = 0; i < num; i++) {
            System.out.printf(i + 1 + "번째 학생의 이름: ");
            name[i] = sc.next();
            System.out.printf(i + 1 + "번째 학생의 영어 점수: ");
            int eng = sc.nextInt();
            System.out.printf(i + 1 + "번째 학생의 수학 점수: ");
            int math = sc.nextInt();

            ave[i] = (eng + math) / 2;

            if (ave[i] > aveMax) {
                nameMax = name[i];
                aveMax = ave[i];
            } else if (ave[i] == aveMax) {
                nameMax = nameMax + ", " + name[i];
            }
        }
        System.out.printf("1등 학생의 이름은 " + nameMax + " 이고 평균 점수는 " + aveMax + " 입니다.");
    }
}
