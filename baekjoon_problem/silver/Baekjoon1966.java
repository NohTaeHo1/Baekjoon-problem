//package baekjoon_problem.silver;
//
//import java.util.*;
//
//public class Baekjoon1966 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // 여기서 Comparator를 사용하여 int[]의 1번 인덱스 값을 기준으로 오름차순 정렬하도록 정의합니다.
//        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return Integer.compare(o1[1], o2[1]);
//            }
//        });
//        int testCase = sc.nextInt();
//        for (int i = 0; i < testCase; i++) {
//            int paperNumber = sc.nextInt();
//            int questionIndex = sc.nextInt();
//            for (int j = 0; j < paperNumber; j++) {
//                int[] arr = {j, sc.nextInt()};
//                queue.add(arr);
//            }
//        int[] max = maxImpotance(queue);
//        if(queue.poll().equals(max)){
//            queue.remove();
//        }
//
//
//        }
//
//
//
//    }
//
//    public static int print(Queue<int[]> queue, int j) {
//        queue.
//
//    }
//
//    public static int[] maxImpotance(Queue<int[]> queue) {
//        int max = 0;
//        int index = 0;
//        int j = 0;
//        for (int[] arr : queue) {
//            if (arr[1] > max) {
//                max = arr[1];
//                index = j;
//            }
//            j++;
//        }
//        return new int[]{index, max};
//    }
//}
//
