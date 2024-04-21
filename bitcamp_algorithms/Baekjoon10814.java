package bitcamp_algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Baekjoon10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());

        List<String[]> member = new ArrayList<>();

        for (int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");
            member.add(input);
        }

        member.sort(Comparator.comparing(i -> Integer.parseInt(i[0])));

        for (int i = 0; i < testCase; i++) {
            String[] output = member.get(i);
            bw.write(output[0] + " " + output[1] + "\n");
        }

        bw.flush();
    }
}
