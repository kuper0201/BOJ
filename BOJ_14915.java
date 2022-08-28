/*
2022.08.28. (일)
https://boj.kr/14915
"진수 변환기" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] s = br.readLine().split(" ");
        String res = "0123456789ABCDEF";

        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);

        if(M == 0) {
            System.out.println("0");
            return;
        }

        while(M != 0){
            sb.append(res.charAt(M % N));
            M /= N;
        }

        System.out.println(sb.reverse());
    }
}
