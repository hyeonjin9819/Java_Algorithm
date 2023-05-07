package org.example.baekjoon.week2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/git/Java_Algorithm/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] s=br.readLine().split(" ");
        int ans = 0;

        for(int i=0; i<T; i++) {
            int cnt = 0;
            for(int j=Integer.parseInt(s[i])-1; j>1; j--) {
                if(Integer.parseInt(s[i]) % j ==0) {
                    cnt += 1;
                }
            }
            if("1".equals(s[i])) { // 1은 무조건 소수가 아니니까 넘어간다
                continue;
            }else if(cnt == 0) { // 소수다.
                ans += 1;
            }
        }
        System.out.println(ans);

        br.close();
    }
}
