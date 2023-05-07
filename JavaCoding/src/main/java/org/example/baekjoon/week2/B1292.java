package org.example.baekjoon.week2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B1292 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/git/Java_Algorithm/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int sum = 0;
        int i= 0;
        int ans = 0;

        while(sum < B) {
            i += 1;
            sum += i;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int j=1 ;j <=i; j++) {
           for (int q= 1; q<=j; q++){
               list.add(j);
           }
        }

        for(int x = A; x<=B; x++) {
            ans += list.get(x-1);
        }

        System.out.println(ans);
    }
}
