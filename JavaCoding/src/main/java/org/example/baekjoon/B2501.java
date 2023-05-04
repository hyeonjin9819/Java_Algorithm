package org.example.baekjoon;

import java.io.*;
import java.util.ArrayList;

public class B2501 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/Desktop/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");

        int N = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            if (N % i == 0) {
                list.add(i);
            }
        }

        if (list.size() <K) {
            System.out.println(0);
        }else {
            System.out.println(list.get(K - 1));
        }

        br.close();
    }
}
