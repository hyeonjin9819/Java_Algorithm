package org.example.baekjoon.week2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;

public class B1978 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("/Users/hyeonjinkim/git/Java_Algorithm/JavaCoding/src/main/java/org/example/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=M; i<=N; i++) {
            if(i== 1) { // i가 1인경우는 패스하고 진행 -> 어짜피 소수 아니니까
                continue;
            }
            boolean check = false; // 초기상태 혹은 소수임
            for(int j=2; j<i; j++) {
                if(i % j == 0){ // 해당 조건에 들어오면 소수가 아님
                    check = true; // 소수가 아니면 True로 바꿈
                    break; // 최대한 적게 돌리기 위해 true로 바뀌는 순간 탈출
                }
            }

            if(check == false) { // 소수
                list.add(i);
            }
        }
        // ArrayList의 통계를 만들어주는 라이브러리
        IntSummaryStatistics status = list.stream().mapToInt(Integer::intValue).summaryStatistics();

        if (status.getCount() == 0) { // 소수가 한개도 없는 경우
            System.out.println(-1);
        }else {
            System.out.println(status.getSum());
            System.out.println(status.getMin());
        }

        br.close();
    }
}
