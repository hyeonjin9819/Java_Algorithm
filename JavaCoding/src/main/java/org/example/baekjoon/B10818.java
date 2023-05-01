package org.example.baekjoon;

import java.io.*;

public class B10818 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/Desktop/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int min = Integer.parseInt(s[0]);
        int max = Integer.parseInt(s[0]);
        for (int i=0; i<T; i++) {
            // 최대 구하기
            if (Integer.parseInt(s[i]) > max) {
                max = Integer.parseInt(s[i]);
            }
            // 최소 구하기
            if (Integer.parseInt(s[i]) < min) {
                min = Integer.parseInt(s[i]);
            }
        }
        System.out.println(min + " " +max);
    }
}
