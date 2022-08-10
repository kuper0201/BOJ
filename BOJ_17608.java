/*
2022.08.10. (수)
https://boj.kr/17608
막대기 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stk = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) stk.push(Integer.parseInt(br.readLine()));

        int max = Integer.MIN_VALUE, cnt = 0;
        while(!stk.empty()) {
            int pop = stk.pop();
            if(pop > max) {
                max = pop;
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
