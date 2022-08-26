/*
2022.08.26. (금)
https://boj.kr/2998
"8진수" 문제 풀이
*/
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder(br.readLine());
        sb = sb.reverse();

        while(sb.length() % 3 != 0) sb.append("0");
        for(int i = 0; i < sb.length(); i+=3) {
            int num = 0;
            for(int j = i; j < i + 3; j++) num += Math.pow(2, j % 3) * (sb.charAt(j) - '0');

            res.append(num);
        }

        System.out.println(res.reverse());
    }
}
