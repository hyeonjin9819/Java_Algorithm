package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10870 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/Desktop/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        System.out.println(fib(T));
        br.close();
    }

    static int fib(int T) {
        if (T == 0) return 0;
        if (T == 1) return 1;
        return fib(T-2) + fib(T-1);
    }
}
