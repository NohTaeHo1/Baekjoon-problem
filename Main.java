import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//국어 영어 성적의 합 또는 수학 과학 성적의 합이 가장 높은 사람을 뽑는 프로그램 만들기

        System.out.printf("학생수 입력 : ");
        int student = sc.nextInt();
        String[] subject = {"국어", "영어", "수학", "과학"};
        String[] name = new String[student];
        int[] score = new int[4];
        int[] scoreSum = new int[student];

        String maxName = "";
        int maxScore = 0;

        String whatSub = "";

        for (int i=0;i<student;i++){
            System.out.printf(i+1+"번째 학생의 이름 : ");
            name[i] = sc.next();

            for(int j=0;j<4;j++){
                System.out.printf(subject[j]+"의 점수 : ");
                score[j] = sc.nextInt();
                if(score[0]+score[1]>score[2]+score[3]){
                    scoreSum[i] = score[0]+score[1];
                    whatSub = "국어 영어 성적의 합";
                }
                else{
                    scoreSum[i] = score[2]+score[3];
                    whatSub = "수학 과학 성적의 합";
                }
            }
            if (scoreSum[i]>maxScore){
                maxName = name[i];
                maxScore = scoreSum[i];
            }


        }
        System.out.printf("최고 성적인 "+maxName+" 학생의 "+whatSub+"은 "+maxScore+"입니다");
    }
}
