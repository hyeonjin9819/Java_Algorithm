package org.example.baekjoon.week2;

import java.io.*;
import java.util.ArrayList;

public class B2609 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/git/Java_Algorithm/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int min = 0;
        int so = 1;
        int dae = 1;

        if (a>=b) {
            min = b;
        } else{
            min = a;
        }

        for(int i = min; i>1; i--){
            if ((a % i ==0) && (b %i==0)) {
                dae *= i;
                a /= i;
                b /= i;
            }
        }
        so = dae * a * b;

        System.out.println(dae);
        System.out.println(so);
        br.close();
    }
}
