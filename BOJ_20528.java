/*
2022.08.31. (수)
https://boj.kr/20528
"끝말잇기" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        char ch = s[0].charAt(0);

        for(int i = 1; i < N; i++) {
            if(s[i].charAt(0) != ch) {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}
