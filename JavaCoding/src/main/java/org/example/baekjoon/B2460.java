package org.example.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class B2460 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("C:\\Users\\User\\Desktop\\Java_Algorithm-main\\JavaCoding\\src\\main\\java\\org\\example\\baekjoon\\input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> people = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<10; i++) {
            String[] s=br.readLine().split(" ");
            int out = Integer.parseInt(s[0]);
            int in = Integer.parseInt(s[1]);
            sum = sum + in - out;
            people.add(sum);
        }
        // 최대값 라이브러리
        int ans= Collections.max(people);
        System.out.println(ans);

        br.close();
    }
}
