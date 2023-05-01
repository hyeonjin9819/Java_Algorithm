package org.example.baekjoon;

import java.io.*;

public class B3460 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/Desktop/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            while(N>0) {
                if (N % 2 == 1) {
                    System.out.print(cnt + " ");
                }
                N /= 2;
                cnt+=1;
            }
        }
    }
}
