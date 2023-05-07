package org.example.baekjoon.week2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class B2693 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/git/Java_Algorithm/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            String[] s = br.readLine().split(" ");

            for(int j=0; j<10; j++) {
                list.add(Integer.parseInt(s[j]));
            }
            Collections.sort(list);
            System.out.println(list.get(7));
        }
        br.close();
    }
}
